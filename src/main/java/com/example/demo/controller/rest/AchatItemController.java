package com.example.demo.controller.rest;

import com.example.demo.model.AchatItem;
import com.example.demo.service.AchatItemService;
import com.example.demo.service.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AchatItemController {
    @Autowired
    private AchatItemService achatItemService;
    @PostMapping("/api/item/add")
    public AchatItem addAchatItem(@RequestBody AchatItem achatItem){
        return achatItemService.addAchatItem(achatItem);
    }
}
