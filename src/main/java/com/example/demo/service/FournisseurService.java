package com.example.demo.service;

import com.example.demo.model.Fournisseur;
import com.example.demo.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepository fournisseurRepository;

    public Fournisseur saveFournissuer(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }
    public List<Fournisseur> fournisseurList(){
        return fournisseurRepository.findAll();
    }
}
