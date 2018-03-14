import org.apache.commons.math3.complex.Complex;

public class Complexe
{
    public static void main()
    {
        Complex c1 = new Complex(2,4);
        Complex c2 = new Complex(4,6);
        Complex c3 = new Complex(3,7);
        Complex c4 = new Complex(6,9);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        
        System.out.println(c1.add(3));
    }
}