package com.nestdigital.receipebackend.controller;


import com.nestdigital.receipebackend.doa.ReceipeDoa;
import com.nestdigital.receipebackend.model.ReceipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReceipeController {


    @Autowired
    private ReceipeDoa doa;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addReceipe",consumes = "application/json",produces = "application/json")
    public String Receipeadd(@RequestBody ReceipeModel receipe){
        System.out.println(receipe.toString());
        doa.save(receipe);
        return "{status=success}";

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewReceipe")
    public List<ReceipeModel> viewReceipe(){
        return (List<ReceipeModel>)
        doa.findAll();

    }
}
