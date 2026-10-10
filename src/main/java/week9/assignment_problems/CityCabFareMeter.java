package week9.assignment_problems;

import java.util.*;

public class CityCabFareMeter {
    interface NightService {
        default double nightFare(double fare) { return fare*1.2; }
    }
    static abstract class Cab {
        static final double MINIMUM_FARE=100;
        double km;
        Cab(double km) { this.km=km; }
        abstract double rate();
        final double dayFare() { return Math.max(MINIMUM_FARE,km*rate()); }
    }
    static class Mini extends Cab {
        Mini(double km) { super(km); }
        @Override double rate() { return 10; }
    }
    static class Sedan extends Cab implements NightService {
        Sedan(double km) { super(km); }
        @Override double rate() { return 14; }
    }
    static class SUV extends Cab implements NightService {
        SUV(double km) { super(km); }
        @Override double rate() { return 18; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
        int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++) {
            String type=sc.next(); double km=sc.nextDouble(); String time=sc.next(); Cab cab;
            switch(type) {
                case "MINI": cab=new Mini(km); break;
                case "SEDAN": cab=new Sedan(km); break;
                case "SUV": cab=new SUV(km); break;
                default: throw new IllegalArgumentException("Unknown cab");
            }
            if(time.equals("NIGHT") && !(cab instanceof NightService)) {
                System.out.println(type+": night service not available"); continue;
            }
            double fare=cab.dayFare();
            if(time.equals("NIGHT")) fare=((NightService)cab).nightFare(fare);
            total+=fare; System.out.printf(Locale.US,"%s: %.2f%n",type,fare);
        }
        System.out.printf(Locale.US,"Total: %.2f%n",total); sc.close();
    }
}
