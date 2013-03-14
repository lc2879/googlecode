public class minStack extends Stack<Integer>{
Stack<Integer> minSt;
public minStack(){
     minSt=new Stack<Integer>();
}

public void push(int value){
if(value<=min()){
minSt.push(value);
}
super.push(value);
}

public int pop(){
int value=super.pop();
if(value==min())
minSt.pop();
return value;
}
public int min(){
if(minSt.isEmpty())
       return Integer.MAX_VALUE;
 return minSt.peek();
}

}
