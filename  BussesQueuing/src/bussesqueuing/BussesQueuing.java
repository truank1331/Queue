package bussesqueuing;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class BussesQueuing {
    public static void main(String[] args) {
        int n = new Random().nextInt(41)+10;
        List<Integer> number = new ArrayList<>();
        for(int i=0;i<n;i++) 
            number.add(i+1);
        Collections.shuffle(number);
        Queue<String> waitQ = new LinkedBlockingQueue<>( n );
        for(Integer i: number) 
            waitQ.add("No."+i );
        Queue<String> bus1Q = new LinkedBlockingQueue<>(9);
        Queue<String> bus2Q = new LinkedBlockingQueue<>(9);
        Queue<String> bus3Q = new LinkedBlockingQueue<>(9);
        while(true){
            if((bus1Q.remainingCapacity() > 0 && bus2Q.remainingCapacity() > 0 && bus3Q.remainingCapacity() > 0)||waitQ.isEmpty())
                break;
            List<Integer> availableBus = new ArrayList<>();
            if(bus1Q.remainingCapacity() > 0){
                availableBus.add(1);
            }
            if(bus2Q.remainingCapacity() > 0){
                availableBus.add(2);
            }
            if(bus3Q.remainingCapacity() > 0){
                availableBus.add(3);
            }
            Collections.shuffle(availableBus);
            if(availableBus.indexOf(1)==1){
                bus1Q.add(waitQ.remove());
            }
            else if(availableBus.indexOf(1)==2){
                bus2Q.add(waitQ.remove());
            }
            else if(availableBus.indexOf(1)==3){
                bus3Q.add(waitQ.remove());
            }
        }
        System.out.println("n="+n);
        System.out.println("Bus-1:"+bus1Q);
        System.out.println("Bus-2:"+bus2Q);
        System.out.println("Bus-3:"+bus3Q);
        System.out.println("Wait:"+waitQ);
    }
    
}
