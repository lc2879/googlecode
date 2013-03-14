/** © 2012 interviewqa4java.blogspot.com */
public class BigInteger {
    public static void main(String[] args) {
        int bigInt1 = Integer.MAX_VALUE;
        int bigInt2 = Integer.MAX_VALUE;
    
        System.out.println(bigInt1+" + "+bigInt2+" = "+add(bigInt1, bigInt2));
    }
    
    public static String add(int bigInt1, int bigInt2) {
        //Find array length
        int length1 = intLenght(bigInt1);
        int length2 = intLenght(bigInt2);
        int arrayLength = Math.max(length1, length2);
                
        //convert numbers into array; Ex: 157 -> [7, 5, 1, 0, 0] 
        int array1[] = intToArray(bigInt1, length1, arrayLength);
        int array2[] = intToArray(bigInt2, length2, arrayLength);
        
        //sum arrays
        return sumArray(array1, array2);
    }
    
    /** Solution logic here*/
    private static String sumArray(int[] array1, int[] array2) {
        int carry=0;
        int sumArray[] = new int[array1.length + 1];
        
        //sum arrays
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = (array1[i] + array2[i] + carry) % 10 ; //sum digits + carry; then extract last digit
            carry = (array1[i] + array2[i] + carry) / 10; //Compute carry
        }
        sumArray[array1.length] = carry;
        return arrayToString(sumArray);
    }
    
    /** Auxiliary methods*/
    private static int intLenght(int bigInt) {
        return Integer.toString(bigInt).length();
    }
    private static int[] intToArray(int bigInt, int bigIntLength, int arrayLength) {
        
        int array[] = new int[arrayLength ]; 
        for (int i = 0; i < arrayLength ; i++) {
            array[i] = ( i<bigIntLength ?
                             getDigitAtIndex(bigInt, bigIntLength - i -1) :
                             0 ); //complete the rest of the array with 0
        }
        return array;
    }
    private static int getDigitAtIndex(int longint,int index){        
        return Integer.parseInt(Integer.toString(longint).substring(index, index+1)); 
    }
    private static String arrayToString(int[] sumArray) {
        String sum = "";
        boolean firstNonZero = false; 
        for (int i = sumArray.length-1; i >= 0 ; i--) { //from array end to beginning
            
            if(!firstNonZero && (sumArray[i]==0)){ //ignore if 1st digits are 0 
                continue;
            } else{
                firstNonZero=true;
            }
            sum += sumArray[i];
            if((i%3 ==0)&&i!=0){ sum +=",";}  //formatting
        }
        String sumStr = sum.length()==0?"0":sum; // handle the 0 value (haha, input was not big!)
        return sumStr;
    }
}

