package adrianinterviewq2;
public class Counter {
    
    public static int nowServing = 0;
    
    boolean Online = true;
    int ticket = -1;
    int id;

    public Counter(int id) {
        this.id = id;
    }
    
    public void GoOffline(){
        
        while(ticket == -1){
        
        this.Online = false;
        System.out.println(toString() + "Goes offline!");
        AdrianInterviewQ2.CusInterface.setStatus(id, "Offline!");
        AdrianInterviewQ2.CusInterface.setStatusColour(id, 2);
        AdrianInterviewQ2.CounterInterface.setDisableButton(id);
        return;
        }
        
        System.out.println("Counter "+ id +" is serving ticket " + ticket+" ! ");
    
    };
    
    public void ComCur(){
        
        if(ticket != -1){
            System.out.println(toString() + "Completing " + ticket + "!");
            AdrianInterviewQ2.CusInterface.setStatus(id, "Available!");
            AdrianInterviewQ2.CusInterface.setStatusColour(id, 1);
            ticket = -1;
            return;
        }
        
        System.out.println(toString() + "There is no customer on this counter!");
        

    };
    
    public void CallNext(){
       while(ticket == -1){
           if(AdrianInterviewQ2.ticketList.isEmpty()){
           System.out.println(toString() + "There is no ticket queue!");
           return;
       }
       
       ticket = AdrianInterviewQ2.ticketList.poll();
       System.out.println(toString() + "Ticket "+ticket+" is at counter");
       String str = String.format("%d", ticket);
       AdrianInterviewQ2.CusInterface.setStatus(id, str);
       nowServing = ticket;
       AdrianInterviewQ2.CusInterface.setStatusColour(id, 3);
       return;
       }
       
       System.out.println("Counter "+ id +" is serving ticket " + ticket+" ! ");
    };
    
    public String toString(){
        return "Counter "+ id + " : ";
    }
    
}
