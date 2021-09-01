package com.example.weconnect;

public class Messages {

    String imageUrl;
    String image_Name;
    String price;
    String phonenumber;
    String address;
    String upi;


    public Messages() {
    }

    public Messages(String imageUrl, String image_Name, String price, String phonenumber, String address, String upi) {
        this.imageUrl = imageUrl;
        this.image_Name = image_Name;
        this.price = price;
        this.phonenumber = phonenumber;
        this.address = address;
        this.upi = upi;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImage_Name() {
        return image_Name;
    }

    public void setImage_Name(String image_Name) {
        this.image_Name = image_Name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }
}