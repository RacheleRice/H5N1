package org.h5n1.northernmigration.service;

import org.h5n1.northernmigration.entity.NassData;
import org.h5n1.northernmigration.repository.NassDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NassDataService {

    private final NassDataRepository nassDataRepository;

    @Autowired
    public NassDataService(NassDataRepository nassDataRepository) {
        this.nassDataRepository = nassDataRepository;
    }

    public List<NassData> getNassDataList() {
        return nassDataRepository.findAll();
    }

    public boolean checkCountyForWetlandInNC(String countyInput) {
        List<NassData> nassDataList = getNassDataList();
        for (NassData nassData : nassDataList) {
            if (nassData.getStateAlpha().equalsIgnoreCase("NC") && nassData.getCountyName().equalsIgnoreCase(countyInput)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCountyForWetlandInOK(String countyInput) {
        List<NassData> nassDataList = getNassDataList();
        for (NassData nassData : nassDataList) {
            if (nassData.getStateAlpha().equalsIgnoreCase("OK") && nassData.getCountyName().equalsIgnoreCase(countyInput)) {
                return true;
            }
        }
        return false;
    }
}






