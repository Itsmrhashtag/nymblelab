package com.nymble.lab.controller;

import com.nymble.lab.model.Packages;
import com.nymble.lab.repo.PackagesRepo;
import com.nymble.lab.service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PackagesController {

    @Autowired
    public AllService allService;

//    @Autowired
//    private PackagesRepo packagesRepo;

    @GetMapping("/packages")
    public List<Packages> getPackages() {
        List<Packages> packages = allService.getPackages();

        return packages;

    }
}
