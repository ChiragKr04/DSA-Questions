class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1;
        int n = arr.length;
        int [] out = new int[n];
        for(int i = n - 1; i>=0; i--) {

            out[i] = max;

            max = Math.max(arr[i], max);

        }

        return out;

    }
}