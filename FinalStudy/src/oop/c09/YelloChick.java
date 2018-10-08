package oop.c09;

public class YelloChick {
    private int x;
    private int y;

    public YelloChick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("병아리 위치는 ("+x+" , "+y+")");
    }

    public void walk() {
        System.out.println("she can walk!");
    }

    public void ppick() {
        System.out.println("삑삑");
    }
}
