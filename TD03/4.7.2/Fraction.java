public class Fraction implements InterfaceFraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction(int numerator)
    {
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    public Fraction()
    {
        this.numerator = 0;
        this.numerator = 1;
    }
    
    public int getNumerator()
    {
        return this.numerator;
    }
    
    public int getDenominator()
    {
        return this.denominator;
    }
    
    public double getDouble()
    {
        double res = 0;
        if (this.denominator !=0)
        {
            res = this.numerator/this.denominator;
        }
        return res;
    }
}
