package org.h5n1.northernmigration.controller;

import org.h5n1.northernmigration.entity.NassData;
import org.h5n1.northernmigration.repository.NassDataRepository;
import org.h5n1.northernmigration.service.NassDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nass-data")
public class NassDataController {

    @Autowired
    private NassDataService nassDataService;

    @Autowired
    private NassDataRepository nassDataRepository;

    @GetMapping
    public List<NassData> getAllNassData() {

        return nassDataRepository.findAll();
    }

}



