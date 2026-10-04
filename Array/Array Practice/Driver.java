

public class Driver {
    public static void main (String[] a) {
        byte [] b = new byte[3];
        System.out.println(b.getClass().getName());

        short [] s = new short[3];
        System.out.println(s.getClass().getName());

        int [] i = new int[3];
        System.out.println(i.getClass().getName());

        long [] l = new long[3];
        System.out.println(l.getClass().getName());

        double [] d = new double[3];
        System.out.println(d.getClass().getName());

        float [] f = new float[3];
        System.out.println(f.getClass().getName());

        char [] ch = new char[3];
        System.out.println(ch.getClass().getName());

        boolean []brr = new boolean[2];
        System.out.println(brr.getClass().getName());
    }
}