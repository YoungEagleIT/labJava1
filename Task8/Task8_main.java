package Laba_1.Task8;

public class Task8_main {
    public static void main(final String[] args) {
       final CustomDouble a = new CustomDouble(4,0.2);
        final CustomDouble b = new CustomDouble(3,0.9);
        final  CustomDouble c = a.plus(b);
        System.out.println("+: " + c.toDouble());
        final  CustomDouble d = a.minus(b);
        System.out.println("-: " + d.toDouble());
    }
}
