public class longestsubarray {
    public int solution(int []nums,int k){
        int maxlen=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
        for(int j=i;j<n;j++){
            sum=sum+nums[j];
            if(sum==k){
                int len=j-i+1;
                maxlen=Math.max(len,maxlen);
        }
    }
}
        return maxlen;
    }
     public static void main(String[] args) {
        longestsubarray obj = new longestsubarray();

        int[] nums = {1,2,3};
        int k = 3;

        int result = obj.solution(nums, k);

        System.out.println("Result: " + result);
    }
}
