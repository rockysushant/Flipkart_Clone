package com.example.bottomnavigatorbig.Model;


public class MainModel2 {

    Integer langLogos;
    String langName;

    public  MainModel2(Integer langLogos, String langName){
        this.langLogos = langLogos;
        this.langName = langName;
        
    }

    public  Integer getLangLogos(){
        return  langLogos;

    }

    public String getLangName(){
        return langName;
    }
}
