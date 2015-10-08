

public class HarmonicSum {
    public static void main (String []args) {
        //Harmonic Sum
        double sum = 0;
        for (double n = 1; n <= 50000; n++)
        {
            sum = sum + (1.0/n);
        }
        System.out.println(sum);
        //Harmonic Sum Backwards
        double sum1 = 0;
        for (double m = 50000; m >= 1; m--)
        {
            sum1 = sum1 + (1.0/m);
        }
        System.out.println(sum1);
        //Pi
        double pie = 0;
        for (double p = 1; p <= 10000000; p=p+4)
        {
            pie = pie + ((1.0/p) - (1.0/(p + 2) ));
        }
        System.out.println(4*pie);
        System.out.println(Math.pi);
        //One
        double one = 0;
        for (double i = 2; i <= 1000000; i=i*2)
        {
            one = one + (1.0/i);
        }
        System.out.println(one);
    }
}