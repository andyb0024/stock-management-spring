package com.example.demo.service;

import com.example.demo.calucation.PerformCalculation;
import com.example.demo.model.Achat;
import com.example.demo.model.AchatItem;
import com.example.demo.model.Achats;
import com.example.demo.model.Product;
import com.example.demo.repository.AchatItemRepository;
import com.example.demo.repository.AchatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AchatService {
    @Autowired
    private AchatRepository achatRepository;
    @Autowired
    private AchatItemRepository achatItemRepository;


    public Achat saveAchat(Achat achat) {

        achat = achatRepository.save(achat);
        PerformCalculation obj = new PerformCalculation();
        obj.getBalance(achat);
        achat.setDate(new Date());
        for (AchatItem item : achat.getItems()) {
            item.setAchat(achat);

            achatItemRepository.save(item);
        }

        AchatItem ai = new AchatItem();

        System.out.println(ai.getRprice() + " " + ai.getPid() + " " + ai.getQte() + " ");

        return achat;
    }

    public Achat saveAchats(Achats achats) {

        Achat achat = achatRepository.save(achats.getAchat());
        PerformCalculation obj = new PerformCalculation();
        obj.getBalance(achat);

        achat.setDate(new Date());

        List<AchatItem> Items=new ArrayList<>();

        for (AchatItem item : achats.getItems()) {
            item.setAchat(achat);
            item = achatItemRepository.save(item);
            Items.add(item);
        }
        System.out.println(Items);
        //achat.setItems(achats.getItems());
        return achat;
    }
}
