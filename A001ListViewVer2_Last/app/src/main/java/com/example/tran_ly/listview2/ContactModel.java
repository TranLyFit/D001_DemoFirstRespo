package com.example.tran_ly.listview2;

public class ContactModel {
    private int idImg1;
    private int idImg2;
    private String name;
    private String phone;

    public  ContactModel(int img1, int img2, String name, String phone){
        this.idImg1= img1;
        this.idImg2= img2;
        this.name=name;
        this.phone = phone;
    }

    int getidImg1(){
        return idImg1;
    }
    int getidImg2(){
        return  idImg2;
    }
    String getName(){
        return  name;
    }
    String getPhone(){
        return phone;
    }

    void setidImg1(int img){
        this.idImg1=img;
    }
    void setidImg2(int img){
        this.idImg2=img;
    }
    void setName(String name){
        this.name=name;
    }
    void setPhone(String phone)
    {
        this.phone=phone;
    }
}
