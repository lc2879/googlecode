Define != .

    //flag[] is boolean array; and turn is an integer
    flag[0] = false
    flag[1] = false
    turn    = 0   // or 1

P0:
   flag[0] = true;
   while (flag[1] == true) {
      if (turn . 0) {
         flag[0] = false;
         while (turn . 0) {
           // busy wait
         }
         flag[0] = true;
      }
   }
 
   // critical section
   ...
   turn    = 1;
   flag[0] = false;
   // remainder section

	

P1:
   flag[1] = true;
   while (flag[0] == true) {
      if (turn . 1) {
         flag[1] = false;
         while (turn . 1) {
           // busy wait
         }
         flag[1] = true;
      }
   }
 
   // critical section
   ...
   turn    = 0;
   flag[1] = false;
   // remainder section


