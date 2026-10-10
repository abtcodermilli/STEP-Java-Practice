package week9.class_problems;

import java.util.*;

public class ElectricityConnectionBilling {
    static abstract class Connection {
        double units;
        abstract double bill();
    }
    static class Home extends Connection {
        
        Home(double units) { this.units=units; }
        @Override double bill() { return Math.min(units,100)*5 + Math.max(0,units-100)*7; }
    }
    static class Shop extends Connection {
        
        Shop(double units) { this.units=units; }
        @Override double bill() { return units*8+100; }
    }
    static class Factory extends Connection {
        
        Factory(double units) { this.units=units; }
        @Override double bill() { return Math.max(1000,units*6); }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units=sc.nextDouble(); Connection connection;
            switch(type) {
                case "HOME": connection=new Home(units); break;
                case "SHOP": connection=new Shop(units); break;
                case "FACTORY": connection=new Factory(units); break;
                default: throw new IllegalArgumentException("Unknown connection type");
            }
            double bill=connection.bill(); total+=bill;
            System.out.printf(Locale.US,"%s: %.2f%n",type,bill);
        }
        System.out.printf(Locale.US,"Total: %.2f%n",total);
        sc.close();
    }

}
