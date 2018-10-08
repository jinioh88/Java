package exception;

public class SampleException {
    public static void main(String[] args) {
        SampleException sample = new SampleException();
        String phoneNumber = "0101234567";

        try {
            String[] array = sample.strSplit(phoneNumber,11);
            for(String item:array) {
                System.out.println(item);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String[] strSplit(String str, int arrySize) throws Exception {
        if(str==null || "".equals(str)) {
            throw new Exception("Null Parameter");
        }

        if(arrySize==0)
            throw new ArithmeticException("Can't split with 0");
        if(str.length()<arrySize)
            throw new IllegalArgumentException("arraySize is larger than str length");

        int unitSize = str.length()/arrySize;
        String[] rt = new String[arrySize];

        int idx=0;
        for(int i=0;i<arrySize;i++) {
            rt[i] = str.substring(idx,idx+unitSize);
            idx+=unitSize;
        }
        return rt;
    }
}
