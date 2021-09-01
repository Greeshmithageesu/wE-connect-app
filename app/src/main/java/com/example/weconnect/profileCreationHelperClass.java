package com.example.weconnect;

public class profileCreationHelperClass {
    String username, upi, address, city, state, pincode;

    public profileCreationHelperClass(String username, String upi, String address, String city, String state, String pincode) {
        this.username = username;
        this.upi = upi;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
