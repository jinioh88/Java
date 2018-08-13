package ch01;

public class prac3 {
    public static double max(double first, double... rest) {
        double result = first;
        for(double d : rest)
            result = Math.max(d , result);
        return result;
    }
}
