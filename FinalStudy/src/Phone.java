import java.util.Arrays;

public class Phone implements Cloneable{
    private String phoeName;
    private int serial;
    private int[] arr;

    public Phone() {
    }

    public Phone(String phoeName, int serial) {
        this.phoeName = phoeName;
        this.serial = serial;
    }

    public String getPhoeName() {
        return phoeName;
    }

    public void setPhoeName(String phoeName) {
        this.phoeName = phoeName;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (serial != phone.serial) return false;
        if (phoeName != null ? !phoeName.equals(phone.phoeName) : phone.phoeName != null) return false;
        return Arrays.equals(arr, phone.arr);
    }

    @Override
    public int hashCode() {
        int result = phoeName != null ? phoeName.hashCode() : 0;
        result = 31 * result + serial;
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    @Override
    protected Phone clone() throws CloneNotSupportedException {
        Phone nObj = (Phone)super.clone();
        nObj.arr = arr.clone();
        return  nObj;
    }
}
