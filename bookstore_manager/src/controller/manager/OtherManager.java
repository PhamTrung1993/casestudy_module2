package controller.manager;

import controller.display.DisplayOther;
import model.Other;

public class OtherManager {
    private final Other model;
    private final DisplayOther view;

    public OtherManager(Other model, DisplayOther view) {
        this.model = model;
        this.view = view;
    }
    public String getID() {
        return model.getID();
    }
    public String getName() {
        return model.getName();
    }
    public String getCategory() {
        return model.getCategory();
    }
    public String getOrigin() {
        return model.getOrigin();
    }
    public long getPrice() {
        return model.getPrice();
    }
    public void setPrice(long price) {
        model.setPrice(price);
    }
    public long getAmount() {
        return model.getAmount();
    }
    public void setAmount(int amount) {
        model.setPrice(amount);
    }
    public void updateDisplayOther() {
        view.displayOther(model.getID(),model.getName(),model.getCategory(),model.getOrigin(),model.getPrice(),model.getAmount());
    }
}
