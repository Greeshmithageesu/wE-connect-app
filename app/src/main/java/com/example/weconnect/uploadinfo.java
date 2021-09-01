package com.example.weconnect;

public class uploadinfo {
    public String imageName;
    public String imagePrice;
    public String imageURL;

    public uploadinfo(){}

    public uploadinfo(String name, String url,String price) {
        this.imageName = name;
        this.imageURL = url;
        this.imagePrice=price;

    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
    public String getImagePrice() {
        return imagePrice;
    }


}

