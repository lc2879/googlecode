public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
         
        int i = 0;
 
        if (str.length() == 0) {
            return 0;
        }
        boolean isNeg = false;
        boolean overFlow = false;
        char c = '*'; //anything will do
 
        while (i  < str.length()) {
            c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                i++;
            }
            else if (c == '+' || c == '-' || Character.isDigit(c)) {
                break;
            }
            else {
                return 0;
            }
        }
 
        if (c == '-') {
            isNeg = true;
        }
 
        if (c == '-' || c == '+') {
            i++;
        }
 
        int n = 0;
 
        while (i < str.length()) {
            c = str.charAt(i);
            if (Character.isDigit(c)) {
                int x = Character.digit(c, 10);
                if ((Integer.MAX_VALUE - x)/10 >= n) {
                    n = 10*n + x;
                }
                else {
                    overFlow = true;
                    break;
                }
                i++;
            }
            else {
                break;
            }
        }
 
        if (overFlow) {
            if (isNeg) {
                return Integer.MIN_VALUE;
            }
            else {
                return Integer.MAX_VALUE;
            }
        }
        else {
            if (isNeg) {
                return -n;
            }
            else {
                return n;
            }
        }
    }
}


#include <stdio.h>

int my_atoi(char *string) {
  
  int negative = 0;
  int value = 0;
  char *start;

if (string == NULL) /* if data passed in is null */
    return 0;

start = string;

while(*start == ' ') /* ignore pre-whitespaces */
    start++;

if (*start == '-') { 
    negative = 1;
    start++;
  }

while (*start != '\0') {
    if (*start >= '0' && *start <= '9') { /* numeric characters */
      if (negative == 0 && value * 10 + ((int)*start - '0') < value) { /* check for + buffer overflow */
        printf("buffer overflow \n");
        return 0;
      }
      if (negative == 1 && (((-value) * 10) - ((int)*start - '0') > -value)) { /* check for - buffer overflow */
        printf("buffer overflow \n");
        return 0;
      }
      value = value * 10 + ((int)*start - '0');
    }

start++;
  }

if (negative)
    value = -value;

return value;
}
