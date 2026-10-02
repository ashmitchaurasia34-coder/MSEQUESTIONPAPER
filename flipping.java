import java.util.*;
public class flipping {
    public static void main(String[] args){
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int flip=2;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int k=flip;
            int c=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0)
                    k--;
                if(k<0)
                    break;
                c++;
            }
            if(c>count)
                count=c;
        }
        System.out.println(count);
    }
}
