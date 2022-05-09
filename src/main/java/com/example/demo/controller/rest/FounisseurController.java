package com.example.demo.controller.rest;

import com.example.demo.model.Fournisseur;
import com.example.demo.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FounisseurController {
    @Autowired
    private FournisseurService fournisseurService;


    @PostMapping("/api/fournisseur/add")
    public Fournisseur addFournisseur (@RequestBody Fournisseur fournisseur){
        return fournisseurService.saveFournissuer(fournisseur);
    }
    @GetMapping("/api/fournisseur")
    public List<Fournisseur> getFournisseurList(){
        return fournisseurService.fournisseurList();
    }
}
