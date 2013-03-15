public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry = 1;
        for(int i = digits.length -1;i>=0;i--){
            int num = digits[i] + carry;
            digits[i] = num%10;
            carry = num/10;
            if(carry==0) return digits;
        }
        int newNum[] = new int[digits.length+1];
        for(int i=1;i<digits.length;i++)
        newNum[i] = digits[i];
        newNum[0]=1;
        return newNum;
         
    }
}
