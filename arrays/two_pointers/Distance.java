// Brute force approach
// class Solution {
//     public long[] distance(int[] nums) {
     
//         long arr[] = new long[nums.length];

//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i+1; j < nums.length; j++){
//                if(nums[i] == nums[j]) {
//                     arr[i] += Math.abs(i-j); 
//                 } 

//             }

//             if(i > 0){
//                 for(int k = i -1; k >= 0; k--){
//                     if(nums[i] == nums[k]){
//                         arr[i] += Math.abs(i-k);
//                     }

//                 }
//             }
//         }
//         return arr;
//     }
// }

// 
class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            groups.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> indices : groups.entrySet().stream().map(Map.Entry::getValue).toList()) {
            int k = indices.size();
            if (k == 1) continue; 

            long totalSum = 0;
            for (int idx : indices) totalSum += idx;

            long prefixSum = 0; 
            for (int p = 0; p < k; p++) {
                int idx = indices.get(p);

                long leftContribution = (long) idx * p - prefixSum;

                long countRight = k - p - 1;
                long sumRight = totalSum - prefixSum - idx;
                long rightContribution = sumRight - (long) idx * countRight;

                arr[idx] = leftContribution + rightContribution;

                prefixSum += idx;
            }
        }

        return arr;
    }
}