package com.db.nace.nace.controller;

import com.db.nace.nace.model.OrderDetails;
import com.db.nace.nace.repository.OrderDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private OrderDetailsRepo repo;

    @PostMapping("/putNaceDetails")
    public String saveBook(@RequestBody OrderDetails orderDetails){
        repo.save(orderDetails);

        return "Added Successfully";
    }

    @GetMapping("/getNaceDetails/{order}")
    public Optional<OrderDetails> getOrderDetails(@PathVariable String order) {

        return repo.findById(order);
    }


}
