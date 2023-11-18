package com.practices.trendnews;

public class Items {

    String image_item;
    String title_item;
    String description_item;

    public Items(String title_item, String image_item, String description_item) {
        this.title_item = title_item;
        this.image_item = image_item;
        this.description_item= description_item;
    }

    public String getTitle_item() {
        return title_item;
    }

    public String getImage_item() {
        return image_item;
    }

    public String getDescription_item() {
        return description_item;
    }




}
