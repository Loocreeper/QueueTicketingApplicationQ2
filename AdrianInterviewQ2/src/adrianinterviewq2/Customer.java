package adrianinterviewq2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Customer {
    
    
   
    int currentTicket = 0;
    
    public void TakeNumber(){
       
        if(AdrianInterviewQ2.ticketList.isEmpty()){
            
            currentTicket++;
            System.out.println("Ticket issued " + currentTicket);
            AdrianInterviewQ2.ticketList.offer(currentTicket);
            return;
        }
        
        AdrianInterviewQ2.ticketList.offer(++currentTicket);
        System.out.println("Ticket issued " + currentTicket);
        return;

    }
    
}
