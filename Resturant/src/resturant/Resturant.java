package resturant;

import java.util.Deque;
import java.util.LinkedList;

class ResturantQueue{
    Deque<String> queue;
    ResturantQueue(){
        queue = new LinkedList<>();
    }
    void genInput(int n) {
        for(int i=1;i<=n;i++){
            queue.add("Student - "+i);
        }
    }

    void remove() {
        queue.remove();
    }
    boolean check(){
        return queue.isEmpty();
    }
    String removelast() {
        return queue.removeLast();
    }
}

public class Resturant {

    public static void main(String[] args) {
        ResturantQueue qa = new ResturantQueue();
        qa.genInput(10);
        System.out.println(qa);
        qa.remove();
        qa.remove();
        qa.remove();
        Deque<String> qb = new LinkedList<>();
        while(!qa.check()){
            qb.add(qa.removelast());
        }
        qb.remove();
        qb.remove();
        System.out.println(qb);
    }

}
