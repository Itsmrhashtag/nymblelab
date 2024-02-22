package com.nymble.lab.repo;

import com.nymble.lab.model.Packages;
import com.nymble.lab.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackagesRepo extends JpaRepository<Packages, Integer> {

    Packages findByPname(String pname);
}
