package com.samghebre.CropProtectionDB.controller;

import com.samghebre.CropProtectionDB.model.CropProtectionProduct;
import com.samghebre.CropProtectionDB.repository.CropProtectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("api/")
public class CropProtectionController {

    @Autowired
    private CropProtectionRepository cropProtectionRepository;

    @GetMapping("products")
    public List<CropProtectionProduct> getProducts(){
        return this.cropProtectionRepository.findAll();
    }
}
