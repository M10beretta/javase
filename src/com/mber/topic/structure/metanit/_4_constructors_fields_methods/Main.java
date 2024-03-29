package com.mber.topic.structure.metanit._4_constructors_fields_methods;

public class Main {

    public static void main(String[] args) {

        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00

    }
}
enum Color{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;

    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
