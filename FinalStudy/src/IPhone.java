import java.util.Arrays;

public class IPhone extends Phone {
    public IPhone() {
    }

    public IPhone(String phoeName, int serial) {
        super(phoeName, serial);
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("갤럭시",1);
        int[] arr = {1,2,3,4,5};
        p1.setArr(arr);
        IPhone p2 = null;
        try {
            p2 = (IPhone) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(p2.getArr()));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        if(p1==p2){
            System.out.println("주소가 같다");
        }

        if(p1.equals(p2)) {
            System.out.println("같은 값");
        }
    }
}
