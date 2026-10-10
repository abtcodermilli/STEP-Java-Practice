package week9.assignment_problems;

import java.util.*;

public class MovieTicketCounter {
    static abstract class Ticket {
        static final double CONVENIENCE_FEE=20;
        int count;
        Ticket(int count) { this.count=count; }
        abstract double price();
        final double amount() { return count*(price()+CONVENIENCE_FEE); }
    }
    static class Regular extends Ticket {
        Regular(int count) { super(count); }
        @Override double price() { return 150; }
    }
    static class Premium extends Ticket {
        Premium(int count) { super(count); }
        @Override double price() { return 250; }
    }
    static class Recliner extends Ticket {
        Recliner(int count) { super(count); }
        @Override double price() { return 400; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++) {
            String type=sc.next(); int count=sc.nextInt(); Ticket ticket;
            switch(type) {
                case "REGULAR": ticket=new Regular(count); break;
                case "PREMIUM": ticket=new Premium(count); break;
                case "RECLINER": ticket=new Recliner(count); break;
                default: throw new IllegalArgumentException("Unknown seat");
            }
            double amount=ticket.amount(); total+=amount;
            System.out.printf(Locale.US,"%s: %.2f%n",type,amount);
        }
        System.out.printf(Locale.US,"Total: %.2f%n",total); sc.close();
    }
}
