class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // if digit is less than 9, just increase it
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // digit is 9, becomes 0 and carry continues
            else{
                digits[i] = 0;
            }
        }

        // all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        //default array elements are 0 in java
        return result;
    }
}