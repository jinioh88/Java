package OOP2;

import java.util.Vector;

class Product {
    int price;
    int point;

    public Product(int price) {
        this.price = price;
        point = (int)(price/10.0);
    }

    Product() {
        price = 0;
        point = 0;
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio() {
        super(150);
    }
    public String toString() {return "Audio";}
}

class Buyer {
    int money = 100000;
    int point = 0;
    Vector item = new Vector();

    void buy(Product product){
        if(money< product.price) {
            System.out.println("잔고 부족!");
            return;
        }
        money -= product.price;
        point += product.point;
        item.add(product);
        System.out.println(product+"구입!");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입 제품 없음!");
            return;
        }

        for(int i=0; i<item.size(); i++){
            Product p = (Product) item.get(i);
            sum += p.price;
        }
    }
}

class PolyTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv1 tv = new Tv1();
        Computer computer = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
    }
}
