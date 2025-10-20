class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int value = 0;

        for(String s: operations) {

            if(s.equals("++X") || s.equals("X++")) {
                value++;
            } else {
                value--;
            }

        }

        return value;

    }
}