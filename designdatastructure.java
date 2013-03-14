design a data structure with all O(1) time operation
Design a data structure for the following operations:
I. Enqueue
II. Dequeue
III. Delete a given number(if it is present in the queue, else do nothing)
IV. isNumberPresent
All these operations should take O(1) time 
















?
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
import java.util.LinkedList;
import java.util.Hashtable;
import java.util.Queue;
 
public class fastQueue {
    private LinkedList <Integer> queue;
    private Hashtable<Integer, Integer> hash;
    private int size=0;
    public fastQueue(){
        queue = new LinkedList<Integer>();
        hash = new Hashtable<Integer, Integer> ();
    }
    public void enqueue(int data){
        queue.addLast(data);
        int count = 1;
        size++;
        if(hash.containsKey(data)){
            if(hash.get(data)==-1)
                count = 1;
            else
            count = hash.get(data)+1;
        }
        hash.put(data, count);
    }
    public int dequeue(){
        if(size==0)
            System.out.println("Empty Queue");
        int data=0;
        while(!queue.isEmpty()){
           data = queue.remove();
           int count = hash.get(data);
           if(count==-1) continue;
           if(count>1){
                hash.put(data, count -1);
                size--;
           }
           if(count==1){
               hash.put(data, -1);
               size--;
           }
           return data;
        }
        return Integer.MIN_VALUE;
    }
    public boolean  isNumberPresent(int val){
        if(!hash.containsKey(val)) return false;
        int count =hash.get(val);
         return count>0;
    }
    public boolean DeleteNumber(int val){
        if(!hash.containsKey(val))return false;
        else{
            int count = hash.get(val);
            size -=count;
            hash.put(val,-1 );
            return true;
        }
    }
}
class Test{
    public static void main(String[] args){
        fastQueue queue = new fastQueue();
        for(int i =0;i<5; i++) queue.enqueue(i);
        for(int i =0;i<5; i++) queue.enqueue(i);
        System.out.println(queue.isNumberPresent(5));
        System.out.println(queue.isNumberPresent(4));
        for(int i =0;i<10; i++)
            System.out.print(queue.dequeue() +" ");
        System.out.println();
        System.out.println(queue.isNumberPresent(4));
 
        for(int i =0;i<5; i++) queue.enqueue(i);
        for(int i =0;i<5; i++) queue.enqueue(i);
        queue.DeleteNumber(1);
        queue.DeleteNumber(4);
        for(int i =0;i<7; i++)
            System.out.print(queue.dequeue() +" ");
    }
}
 
/*
run:
false
true
0 1 2 3 4 0 1 2 3 4 
false
0 2 3 0 2 3 Empty Queue
-2147483648 BUILD SUCCESSFUL (total time: 0 seconds)
 
*/
