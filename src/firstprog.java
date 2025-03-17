import java.util.Scanner;

public class firstprog{
 static void swap(int n,int m){
    int c;
    c=n;
    n=m;
    m=c;
     System.out.println("n"+n+"m"+m );

}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int m=sc.nextInt();
    swap(n,m);
        System.out.println(n +" "+m);
    }
}