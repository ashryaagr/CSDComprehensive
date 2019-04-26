package com.example.csdcomprehensive.models;

public class note {
    String text ;

    public note(){

    }
    public note(String s){
        this.text = s ;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
