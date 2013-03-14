
public class xor{
public static void main(String []  args) {
    int[] x = new int[] { 5,7,4,9,5,7,4 };
    int result = 0;
    for (int i=0;i<x.length;i++) {
        result ^= x[i];
    }
    System.out.println("result:"+result);
}
}
