class Solution {
    public void rotate(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) return;
        
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);      // reverse whole arra
        reverse(arr, 0, k - 1);      // reverse first k elements
        reverse(arr, k, n - 1);      // reverse remaining
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right)  {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
