package com.example.demo.Bootstrap;

import com.example.demo.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;


@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;


    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;

    }


    @Override
    public void run(String... args) throws Exception {


        Customer bern = new Customer();
        bern.setFirstName("Bern");
        bern.setLastName("Sand");
        bern.setAddress("222 Twilight Zone");
        bern.setPostal_code("22211");
        bern.setPhone("5553332222");

        Customer miller = new Customer();
        miller.setFirstName("Miller");
        miller.setLastName("Mike");
        miller.setAddress("888 entity manor");
        miller.setPostal_code("99972");
        miller.setPhone("7192223457");


        Customer mark = new Customer();
        mark.setFirstName("Mark");
        mark.setLastName("Flaunc");
        mark.setAddress("Bep Lane");
        mark.setPostal_code("33544");
        mark.setPhone("8085729188");



        Customer sam = new Customer();
        sam.setFirstName("Sam");
        sam.setLastName("Tree");
        sam.setAddress("47162 Bush Lane");
        sam.setPostal_code("32133");
        sam.setPhone("3271118890");


        Customer ash = new Customer();
        ash.setFirstName("Ash");
        ash.setLastName("Russ");
        ash.setAddress("Angus Town");
        ash.setPostal_code("98788");
        ash.setPhone("7275556712");


        customerRepository.save(bern);
        customerRepository.save(miller);
        customerRepository.save(mark);
        customerRepository.save(sam);
        customerRepository.save(ash);

    }

}