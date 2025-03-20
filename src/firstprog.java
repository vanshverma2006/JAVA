import java.util.*;
public class firstprog{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int[]arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no. to be searched");
        int s=sc.nextInt();
        int start=0;
        int end=n-1;
        int mid;
        int index=-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==s) {
                index = mid;
                break;
            }
            else if(s>=arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        if(index==-1)
            System.out.println("not found");
        else
        System.out.println("found at index "+index);

    }
}