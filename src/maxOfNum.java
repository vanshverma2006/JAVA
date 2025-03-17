import java.util.Scanner;

public class maxOfNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));
    }
}