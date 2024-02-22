package com.nymble.lab.service;

import com.nymble.lab.model.Packages;
import com.nymble.lab.repo.PackagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllService {


    @Autowired
    public PackagesRepo packagesRepo;

    public List<Packages> getPackages() {
        return packagesRepo.findAll();
    }
}
