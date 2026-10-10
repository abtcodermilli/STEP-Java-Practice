package week9.class_problems;

import java.util.*;

public class LibraryLateFineCounter {
    static abstract class Item {
        String title; int days;
        abstract double fine();
    }
    static class Book extends Item {
        
        Book(String title, int days) { this.title=title; this.days=days; }
        @Override double fine() { return days*2.0; }
    }
    static class DVD extends Item {
        
        DVD(String title, int days) { this.title=title; this.days=days; }
        @Override double fine() { return Math.min(days*5.0,50); }
    }
    static class Magazine extends Item {
        
        Magazine(String title, int days) { this.title=title; this.days=days; }
        @Override double fine() { return days*1.0; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title=sc.next(); int days=sc.nextInt();
            Item item;
            switch(type) {
                case "BOOK": item=new Book(title,days); break;
                case "DVD": item=new DVD(title,days); break;
                case "MAGAZINE": item=new Magazine(title,days); break;
                default: throw new IllegalArgumentException("Unknown item type");
            }
            double fine=item.fine(); total+=fine;
            System.out.printf(Locale.US,"%s: %.2f%n",item.title,fine);
        }
        System.out.printf(Locale.US,"Total Fines: %.2f%n",total);
        sc.close();
    }

}
