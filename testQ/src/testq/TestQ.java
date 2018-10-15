package testq;

import java.util.Queue;
import java.util.LinkedList;

class TestQueue {
    Queue<String> queue;
    public TestQueue(){
        queue = new LinkedList<>();
    }
    void genInput(int n) {
        for(int i=1;i<=n;i++){
            if(i==n)
                queue.add("A-"+i);
            else
                queue.add("A-"+i+",");
        }
        
    }

    void service() {
        while(queue.peek()!=null){
            System.out.print(queue.remove());     
        }    
    }
}

public class TestQ {

    public static void main(String[] args) {
        TestQueue t = new TestQueue();
        t.genInput(5);
        t.service();
    }

}
