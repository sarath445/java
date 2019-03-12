import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner myinput=new Scanner (System.in);
        int a,b,c;
        System.out.println("enter frst num");
        a=myinput.nextInt();
        System.out.println("enter scnd num");
        b=myinput.nextInt();
        c=a+b;
        System.out.println(c);
    }
}