public class ain{
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int k=8;
      for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(i);
                break;
            }
      }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==k){
                System.out.println(i);
                break;
            }
        }
    }
}