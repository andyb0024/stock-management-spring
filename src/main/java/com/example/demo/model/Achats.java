package com.example.demo.model;

import java.util.List;

public class Achats {
    private List<AchatItem> items;
    private Achat achat;

    public List<AchatItem> getItems() {
        return items;
    }

    public void setItems(List<AchatItem> items) {
        this.items = items;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }
}
