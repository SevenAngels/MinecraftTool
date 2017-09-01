package com.apex.minecrafttool.items;

/**
 * Created by Adam on 9/1/2017.
 * Defines any Minecraft item with an id.
 */

public class Item {
    private String name;
    private String technicalName;
    private String itemID;
    private String imageName;
    private ItemCategory itemCategory;
    private int stackAmount;

    public String getName() {
        return name;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public String getItemID() {
        return itemID;
    }

    public String getImageName() {
        return imageName;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public int getStackAmount() {
        return stackAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setStackAmount(int stackAmount) {
        this.stackAmount = stackAmount;
    }
}
