import java.util.Scanner;
public class BubbleSort {
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
            for ( int j = 0; j < n-i-1; j++){
                if (array[j]>array[j+1]){
                    int temp;
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");

    }
}