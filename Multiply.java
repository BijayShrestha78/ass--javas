import java.util.Scanner;
public class Multiply
{
    public static void main(String[] args)
     {
        int digit;
        Scanner a =new Scanner(System.in);
        System.out.println("Enter a number you want to enter");
        digit=a.nextInt();
        for (int z=1; z<=10; z++) 
        {

            System.out.println(digit+"*"+z+"="+digit*z);

        }
    }
}

