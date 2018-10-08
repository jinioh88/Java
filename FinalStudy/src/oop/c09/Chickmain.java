package oop.c09;

public class Chickmain {
    public static void main(String[] args) {

    YelloChick[] yChiks = new YelloChick[4];
    RedChick[] rChicks = new RedChick[2];

    for(int i=0;i<4;i++) {
        yChiks[i] = new YelloChick(i,i+2);
        yChiks[i].walk();
    }

    }
}
