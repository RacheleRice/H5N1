package org.h5n1.northernmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;


@Service
public class H5N1RiskService {

    private final NassDataService nassDataService;

    @Autowired
    public H5N1RiskService(NassDataService nassDataService) {
        this.nassDataService = nassDataService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
        System.out.println("\n\n");
        System.out.println("********************************");
        System.out.println("*Welcome to the H5N1 Risk Tool!*");
        System.out.println("********************************");
        System.out.println("1) Farmer/Operator in NC and OK Only");
        System.out.println("2) Agency  ***Feature Coming Soon***");
        System.out.println("3) Other");
        System.out.println("\n\n");

        userInput = scanner.nextLine();

        if (userInput.equals("1")) {
            System.out.println("Choose a state:   1)  NC        2)  OK");

            String stateInput = scanner.nextLine();

            if (stateInput.equals("1") || stateInput.equalsIgnoreCase("NC")) {
                System.out.println("Enter county: (case insensitive, please spell correctly)");

                String countyInput = scanner.nextLine();

                // logic for NC
                boolean foundCounty = nassDataService.checkCountyForWetlandInNC(countyInput);
                if (foundCounty) {
                    System.out.println("Your poultry/eggs operation is in the same county as a wetland or surface body of water.");
                    System.out.println("Please contact your state poultry agency or the USDA to inquire about H5N1 vaccination recommendations");
                    System.out.println("and to learn about other disease mitigation recommendations you can take to protect your livestock from infected migrating birds.");
                    System.out.println("Thank you for using the H5N1 Risk Tool.");
                } else {
                    System.out.println("No wetlands or surface bodies of water have been found near your location.");
                    System.out.println("Please contact your state poultry agency or the USDA to inquire about current recommendations to");
                    System.out.println("protect your livestock from H5N1 infected migrating birds.");
                    System.out.println("Thank you for using the H5N1 Risk Tool.");
                }

            } else if (stateInput.equals("2") || stateInput.equalsIgnoreCase("OK")) {
                System.out.println("Enter County: (case insensitive, please spell correctly)");

                //logic for OK
                String countyInput = scanner.nextLine();
                boolean foundCounty = nassDataService.checkCountyForWetlandInOK(countyInput);
                if (foundCounty) {
                    System.out.println("Your poultry/eggs operation is in the same county as a wetland or surface body of water.");
                    System.out.println("Please contact your state poultry agency or the USDA to inquire about H5N1 vaccination recommendations");
                    System.out.println("and to learn about other disease mitigation recommendations you can take to protect your livestock from infected migrating birds.");
                    System.out.println("Thank you for using the H5N1 Risk Tool.");
                } else {
                    System.out.println("No wetlands or surface bodies of water have been found near your location.");
                    System.out.println("Please contact your state poultry agency or the USDA to inquire about current recommendations to");
                    System.out.println("protect your livestock from H5N1 infected migrating birds.");
                    System.out.println("Thank you for using the H5N1 Risk Tool.");
                }

            } else {
                System.out.println("Invalid input for State.  Please try again.");
            }
        } else if (userInput.equals("2")) {
            System.out.println("Agency reports by county will be available soon.");
            System.out.println("Thank you for using the H5N1 Risk Tool.");

        } else if (userInput.equals("3") || userInput.equalsIgnoreCase("Other")) {
            System.out.println("More states will be added soon. Please contact your state poultry agency");
            System.out.println("or the USDA to inquire about current recommendations to protect your livestock");
            System.out.println("from H5N1 infected migrating birds.");
            System.out.println("Thank you for using the H5N1 Risk Tool.");
        } else if (userInput.equals("4")) {
            System.out.println("Thank you for using the H5N1 Risk Tool.");
        } else {
            System.out.println("Invalid input. Please try again.");
        }

        } while (!userInput.equals("4"));

        scanner.close();
    }
}
