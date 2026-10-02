
public class removeduplicates {
    int j;
    int duplicates (int arr[]){
     j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int arr[]={1,1,2,2,2,3,4,4,4,5};
        removeduplicates obj=new removeduplicates();
        int len=obj.duplicates(arr);
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+" ");
    }
}
