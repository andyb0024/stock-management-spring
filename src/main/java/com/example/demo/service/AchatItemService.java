package com.example.demo.service;


import com.example.demo.model.AchatItem;
import com.example.demo.repository.AchatItemRepository;
import com.example.demo.repository.AchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AchatItemService {
    @Autowired
    private AchatItemRepository achatItemRepository;


    public AchatItem addAchatItem(AchatItem achatItem){
        return achatItemRepository.save(achatItem);
    }
}
