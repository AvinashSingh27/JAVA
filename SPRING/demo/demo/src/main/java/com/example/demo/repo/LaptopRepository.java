package com.example.demo.repo;

import com.example.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository      // Much more sense that it is a repo layers.
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("SAVED in DB");
    }
}

