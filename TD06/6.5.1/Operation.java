import java.util.*;

public enum Operation
{
    PLUS ("+")
    {
        public double eval(double a, double b)
        {
            return a+b;
        }
    },
    MOINS ("-")
    {
        public double eval(double a, double b)
        {
            return a-b;
        }
    },
    MULT ("*")
    {
        public double eval(double a, double b)
        {
            return a*b;
        }
    },
    DIV ("/")
    {
        public double eval(double a, double b)
        {
            return a/b;
        }
    };
    
    private String Symbole;
    Operation (String Symbole)
    {
        this.Symbole = Symbole;
    }
    private String getSymbole()
    {
        return Symbole;
    }
    
    public abstract double eval(double a, double b);
}