import java.util.*;
interface bank 
{
    public void calculateInterest();
}
class SBI implements bank
{
    double r,amt,Interest;
    public void calculateInterest()
    {
        r=0.7;amt=10000;
        Interest=amt*r;
        System.out.println("Interest="+Interest);
    }
}
class Axis implements bank
{
    double r,amt,Interest;
     public void calculateInterest()
     {
         r=0.2;amt=10000;
         Interest=amt*r;
         System.out.println("Interest="+Interest);
         
     }
}
class Driver
{
    public static void main (String[] args)
    {
        SBI sbi=new SBI();
        sbi.calculateInterest();
        Axis a=new Axis();
        a.calculateInterest();
    }
}
 