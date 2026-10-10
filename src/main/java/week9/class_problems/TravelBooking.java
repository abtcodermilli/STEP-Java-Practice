package week9.class_problems;

import java.util.*;

public class TravelBooking {
    static abstract class Booking {
        static final double BOOKING_FEE=50;
        double distance;
        Booking(double distance) { this.distance=distance; }
        abstract double fare();
        final double total() { return fare()+BOOKING_FEE; }
    }
    static class Bus extends Booking {
        Bus(double d) { super(d); }
        @Override double fare() { return distance*2; }
    }
    static class Train extends Booking {
        Train(double d) { super(d); }
        @Override double fare() { return distance*1.5; }
    }
    static class Flight extends Booking {
        Flight(double d) { super(d); }
        @Override double fare() { return 2500+distance*4; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            String type=sc.next(); double d=sc.nextDouble(); Booking booking;
            switch(type) {
                case "BUS": booking=new Bus(d); break;
                case "TRAIN": booking=new Train(d); break;
                case "FLIGHT": booking=new Flight(d); break;
                default: throw new IllegalArgumentException("Unknown mode");
            }
            System.out.printf(Locale.US,"%s: %.2f%n",type,booking.total());
        }
        sc.close();
    }
}
