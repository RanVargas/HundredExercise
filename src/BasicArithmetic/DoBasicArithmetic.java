package BasicArithmetic;

public class DoBasicArithmetic {
    public static int calc(int m, int n){
        int multiplication = m * n;
        double divided = multiplication / 2.0;
        return (int) (divided % 7);
    }
}
