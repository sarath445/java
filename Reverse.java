import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner myinput=new Scanner (System.in);
        int a,rev=0,rem;
        System.out.println("enter a number");
        a=myinput.nextInt();
        while(a>0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }

System.out.println(rev);
    }
}