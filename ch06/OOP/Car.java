package OOP;

class Car {
    String color;
    int door;
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    // 생성자를 받은 때는 this로 받자.
    Car(){
        this("white",2);
    }

    Car(String color, int door){
        this.color = color;
        this.door = door;
    }
}
