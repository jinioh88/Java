package ch02;

public class Emplyee {
    private String name;
    private double salary;
    private int age;

    public void raiseSal(double byPercent) {
        double raise = salary*byPercent / 100;
        salary += raise;
    }

    public void main(String[] args) {
        Emplyee fred = new Emplyee();
        fred.raiseSal(5);

    }
}


