package streamsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class DryPrincipleTest {
    public void ticketStatus(List<Ticket> ticketList, Predicate<Ticket> predicate){
        Iterator<Ticket> itr=ticketList.iterator();
        for (; itr.hasNext();){
            Ticket ticket=itr.next();
            if (predicate.test(ticket)){
                System.out.println("Ticket Id : "+ticket.ticketId+" Ticket Status "+ticket.status);
            }
        }
    }

    public static void main(String[] args) {


        Predicate<Ticket> successPredicate = (ticket -> ticket.status.equals("ticket successful"));

        Predicate<Ticket> failedPredicate = (ticket -> ticket.status.equals("ticket failed"));


        Predicate<Ticket> blockedPredicate = (ticket -> ticket.status.equals("seat locked"));


        Ticket ticket1 = new Ticket();
        ticket1.ticketId = "1234 5678 9876";
        ticket1.status = "ticket successful";

        Ticket ticket2 = new Ticket();
        ticket2.ticketId = "2345 4567 6789";
        ticket2.status = "ticket successful";

        Ticket ticket3 = new Ticket();
        ticket3.ticketId = "4567 6789 1234";
        ticket3.status = "seat locked";

        Ticket ticket4 = new Ticket();
        ticket4.ticketId = "6789 4567 2345";
        ticket4.status = "seat locked";

        Ticket ticket5 = new Ticket();
        ticket5.ticketId = "9887 5433 4567";
        ticket5.status = "ticket failed";

        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        ticketList.add(ticket4);
        ticketList.add(ticket5);


//        TicketList ticketList1 = new TicketList();
//        ticketList1.ticketList = ticketList;

        DryPrincipleTest dryPrincipleTest=new DryPrincipleTest();

        dryPrincipleTest.ticketStatus(ticketList,successPredicate);
        dryPrincipleTest.ticketStatus(ticketList,failedPredicate);
        dryPrincipleTest.ticketStatus(ticketList,blockedPredicate);



    }
}
