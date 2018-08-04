package OOP;

class Card {
    String kind;
    int number;

    // 클래스 변수(static 변수)
    static int width = 100;
    static int height = 250;
}

class CardTest{
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 10;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 3;

        c1.width = 50;
        c1.height = 80;
    }
}
