package com.example.demo.service;

import com.example.demo.repo.LaptopRepository;
import com.example.demo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired   // Injecting this object using field injections
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
