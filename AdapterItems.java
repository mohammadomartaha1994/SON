package com.sequence.mohammad.sequenceofnumbers;


public class AdapterItems
{
    public  String ID;
    public  String Name;
    public  String  num1,num2,num3,num4,num5;

    AdapterItems(String ID,String Name){
        this.ID=ID;
        this.Name=Name;
    }
    AdapterItems(String Name){
        this.Name=Name;
    }

    AdapterItems(String ID,String num1,String num2 , String num3 , String num4, String num5){
        this.ID=ID;
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;
    }
}


