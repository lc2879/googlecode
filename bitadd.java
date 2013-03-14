public String addBinaryNumbers(String num1, String num2) {
        
        String longestNumber = num1.length() > num2.length() ? num1 : num2;

int padCount = longestNumber == num1 ? num1.length() - num2.length() : num2.length() - num1.length();

String pad = "";
        
        for(int i = 0; i < padCount; i++)
        	pad += "0";
        
        if(longestNumber == num1)
        {
        	num2 = pad + num2;
        }
        else
        {
        	num1 = pad + num1;
        }

String result = "";
        int carry = 0;

for(int i = longestNumber.length() - 1; i >= 0; i--)
        {
            int num1Int = Integer.parseInt(num1.charAt(i)+"");
            int num2Int = Integer.parseInt(num2.charAt(i)+"");

int currentSum = num1Int + num2Int + carry;
            if(currentSum >= 2)
            {
                carry = 1;
                if(currentSum == 2)
                	result += "0";
                else
                	result += "1";
            }
            else
            {
                carry = 0;
                result += currentSum;
            }   
        }

if(carry == 1)
            result += carry;
        
        String finalResult = "";
        for(int i = result.length() - 1; i >= 0; i--)
            finalResult += result.charAt(i);
        
        return finalResult;
    }

