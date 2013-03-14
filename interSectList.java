public class inSecOfList{

  public static LinkedNode intersection(LinkedNode head1,LinkedNode head2){
             /*check if the two lists are intersected*/
               
              if(head1==null||head2==null) return null;
              int len1=0;
              int len2=0;
              LinkedNode tmp1=head1;
	      LinkedNode tmp2=head2;
              while(tmp1!=null){
                       len1++;tmp1=tmp1.next;
		}
              while(tmp2!=null){
                       len2++;tmp2=tmp2.next;
                }
              int dif= (len1-len2)>0? len1-len2:len2-len1;
              tmp1=(len1-len2)>0? head2:head1;
	      tmp2=(len1-len2)>0? head1:head2; 
              while(dif>0){tmp2=tmp2.next;dif--;}
              while(tmp1!=tmp2){tmp1=tmp1.next;tmp2=tmp2.next;}
	return tmp1;
}

}
