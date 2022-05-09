package com.example.demo.calucation;

import com.example.demo.model.Achat;
import com.example.demo.model.AchatItem;
import com.example.demo.model.Product;

public class PerformCalculation {
    public Achat getBalance(Achat achat) {
        int tot = achat.getSubtotal() - achat.getPay();
        achat.setBalance(tot);
        return achat;
    }

    public Product getAchatTotal(Product product){
        double tot=product.getQty()+product.getRemise();
        AchatItem obj=new AchatItem();
        obj.setTotal(tot);

        return product;

    }
}
