import java.util.Scanner;
  public class fibonacci{
    public static void main(String[] args){
       int num,x=0,y=1,z;
       System.out.print("Enter num");
       Scanner r=new Scanner(System.in);
       num=r.nextInt();
       for(int b=1;b<=num;b++){
        System.out.print(x+" ");
        z=x+y;
        x=y;
        y=z;
       }
    }
}