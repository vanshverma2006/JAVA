import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n :: ");
        int n = sc.nextInt() ;
        int [] array = new int [n];
        for (int i=0;i<n;i++){
            System.out.println("enter valur of arra["+i+"]");
            array[i] = sc.nextInt();
        }

        for (int i = 0;i < n-1 ;i++){
            for ( int j = i+1; j < n; j++){
                if (array[i]>array[j]){
                    int temp;
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}