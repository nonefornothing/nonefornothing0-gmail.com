package app;
// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      final double myCheck = 50.00;
      final double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }

    public static void calcTip(double bill)
    {
      double tip;
      final double RATE = 0.15;
      tip = bill + RATE;
      System.out.println("The tip should be at least " + tip);
    }

}