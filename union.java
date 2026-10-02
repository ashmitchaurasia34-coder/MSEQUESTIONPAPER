class union {

    public int[] unionArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int temp[] = new int[m + n];

        // Copy nums1
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        // Copy nums2
        for (int i = m, j = 0; i < m + n; i++, j++) {
            temp[i] = nums2[j];
        }

        return removeduplicates(temp);
    }

    public int[] removeduplicates(int[] nums) {
        int n = nums.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Remove duplicates
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Create result array
        int temp[] = new int[j];
        for (int i = 0; i < j; i++) {
            temp[i] = nums[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        union obj = new union();

        int[] nums1 = {1,1,2,2,3,4,4,5};
        int[] nums2 = {3,4,4,4,4,5,6,7,8,8};

        int[] result = obj.unionArray(nums1, nums2);

        System.out.print("Union Array: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}