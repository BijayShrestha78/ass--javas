import java.util.Scanner;
public class currency 
{
    public static void main(String[] args) 
    {

        Scanner b = new Scanner(System.in);
        System.out.printf("Enter the  Nepalese  rupaiya you want to enter ");
        double nepaliRup = b.nextDouble();
        double usDoll = nepaliRup / 135.03;
        System.out.printf("%.2f Nepali Rup = %.2f US Doll\n", nepaliRup, usDoll);
        
    }
}
