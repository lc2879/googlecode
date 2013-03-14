//convert decimal  to roman

      String roman = "";
         int N = number;
         while (N >= 1000) {
               // Move 1000 from N to roman.
            roman += "M";
            N -= 1000;
         }
         while (N >= 900) {
               // Move 900 from N to roman.
            roman += "CM";
            N -= 900;
         }
         .
         .  // Continue with other values from the above table.
         .


int RomanTodecimal(String roman)
2.     {
3.         int l= roman.length();
4.         int i;
5.         int deci=0;
6.         int num=0;
7.         for (i=l-1;i>=0;i--)
8.         { char x = roman.charAt(i);
9.             x = Character.toUpperCase(x);
10.             switch(x)
11.             {  case 'I':
12.                 num = 1;
13.                 break;
14.                case 'V':
15.                 num = 5;
16.                 break;
17.                 case 'X':
18.                 num = 10;
19.                 break;
20.                 case 'L':
21.                 num = 50;
22.                 break;
23.                 case 'C':
24.                 num = 100;
25.                 break;
26.                 case 'D':
27.                 num = 500;
28.                 break;
29.                 case 'M':
30.                 num = 1000;
31.                 break;
32.                 default:
33.                 { System.out.print ("Error");
34.                   System.exit(0); 
35.                 }
36.             }
37.             if (num<deci)
38.             {deci= deci-num;}
39.              else
40.             deci= deci+num;
41.         }
42.          return deci;
43.         }






