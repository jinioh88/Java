package oop.c09;

public class Student {
    private int haknum;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;

    public Student(int haknum, String name, int kor, int eng, int math) {
        this.haknum = haknum;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int calcTotal() {
        this.total = kor + eng + math;
        return this.total;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"사나",100,95,85);
        Student student2 = new Student(2, "쯔위",80,90,85);

        System.out.println(student1.calcTotal());
        System.out.println(student2.calcTotal());
    }
}
