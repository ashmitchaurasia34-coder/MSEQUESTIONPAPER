import java.util.*;
public class merging {
    public static int[] rotation(int a[],int pivot){
                int temp[]=new int[a.length];
                int n=a.length;
            for(int i=0;i<n;i++)
                temp[i]=a[(i+pivot)%n];
            return temp;
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       int pivot=2;
       int n=arr.length;
       int a[]=new int[n];
        a= rotation(arr,pivot);
        for(int x:a)
            System.out.print(x+" ");
    }
}
