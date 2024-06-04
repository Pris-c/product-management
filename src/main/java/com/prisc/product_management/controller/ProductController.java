package com.prisc.product_management.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/products")
public class ProductController {

    // create
    @PostMapping
    private void save(){
        log.info("Called SAVE");
    }

    // read
    @GetMapping
    private void get(){
        log.info("Called GET");
    }

    // update
    @PutMapping
    private void update(){
        log.info("Called UPDATE");
    }

    // delete
    @DeleteMapping
    private void delete(){
        log.info("Called DELETE");
    }

}
