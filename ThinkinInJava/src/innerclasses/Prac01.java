package innerclasses;

import java.awt.*;

public class Prac01 {
    class Contents {
        private int i = 11;
        public int value() {return i;}
    }
    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
    }

    public Contents container() { return new Contents(); }

    public static void main(String[] args) {
        Prac01 pra01 = new Prac01();
        Prac01.Contents contents = pra01.new Contents();
        Prac01.Destination destination = pra01.new Destination("Tanos");

        Prac01.Contents contents1 = pra01.container();
    }
}
