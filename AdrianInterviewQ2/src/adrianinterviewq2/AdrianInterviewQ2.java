package adrianinterviewq2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AdrianInterviewQ2 {
    
    public static CustomerTemplete CusInterface = new CustomerTemplete();
    public static CounterManagementTemplete CounterInterface = new CounterManagementTemplete();
    public static Counter counter = new Counter(1);
    public static Counter counter2 = new Counter(2);
    public static Counter counter3 = new Counter(3);
    public static Counter counter4 = new Counter(4);
    public static Customer customer = new Customer();
    public static BlockingQueue<Integer> ticketList = new LinkedBlockingQueue<Integer>(50);
    
    
    public static void main(String[] args) {
        
        System.out.println("This is the status console");
        
        customer.TakeNumber();
        customer.TakeNumber();
        customer.TakeNumber();
        
        while(true){
            
            String LTicket = String.format("%4d", customer.currentTicket);
            CusInterface.setLastNumber(LTicket);
            String CTicket = String.format("%4d", Counter.nowServing);
            CusInterface.setNowServing(CTicket);
            
        }
        

    }
    
}
