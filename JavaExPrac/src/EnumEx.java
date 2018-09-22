interface Color {
    public String getColor();
}

enum Sex implements Color {
    Man{
        @Override
        public String getColor() {
            return "파랑";
        }
    }, Women {
        @Override
        public String getColor() {
            return "빨강";
        }
    };
}

public class EnumEx {
    public static void main(String[] args) {
        Color color1  = Sex.Man;
        String str = color1.getColor();
        System.out.println(str);
    }
}
