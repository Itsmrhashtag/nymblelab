package com.nymble.lab.service;

import com.nymble.lab.model.Packages;
import com.nymble.lab.repo.PackagesRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {




        @Mock
        private PackagesRepo packagesRepo;
        //When using Mockito Use @InjectMocks to inject
        //Mocked beans to following class
        @InjectMocks
        private AllService personService;

        @Test
        void getAllPerson()
        {
            //given
            Packages person= new Packages( 1,"hash",20,null);
//            Person person2= new Person(2,"Saksham","New york");
            //When
            given(packagesRepo.findAll())
                    .willReturn(List.of(person));
            var  personList = personService.getPackages();
            //Then
            //Make sure to import assertThat From org.assertj.core.api package
            assertThat(personList).isNotNull();
            assertThat(personList.size()).isEqualTo(1);
        }
    }
