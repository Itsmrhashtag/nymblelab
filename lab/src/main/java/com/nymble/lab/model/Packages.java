package com.nymble.lab.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "package")

public class Packages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "package_name")
    private String pname;
    private int pcapacity;


    @JsonManagedReference
    @OneToMany(mappedBy = "packages",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Destination> destination;





}
