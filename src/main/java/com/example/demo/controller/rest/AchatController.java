package com.example.demo.controller.rest;

import com.example.demo.model.Achat;
import com.example.demo.model.Achats;
import com.example.demo.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AchatController {
    @Autowired
    private AchatService achatService;
    @PostMapping("/api/achat/add")
    public Achat addAchat(@RequestBody Achats achat){

        return achatService.saveAchats(achat);
    }
}
