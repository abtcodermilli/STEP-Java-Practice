package week9.assignment_problems;

import java.util.*;

public class HomeApplianceEnergyReport {
    interface SaverMode {
        default double savedUnits(double units) { return units*0.75; }
    }
    static abstract class Appliance {
        static final double UNIT_PRICE=8;
        double hours;
        Appliance(double hours) { this.hours=hours; }
        abstract double watts();
        final double units() { return watts()*hours/1000; }
    }
    static class Fridge extends Appliance {
        Fridge(double h) { super(h); }
        @Override double watts() { return 150; }
    }
    static class AC extends Appliance implements SaverMode {
        AC(double h) { super(h); }
        @Override double watts() { return 1500; }
    }
    static class TV extends Appliance {
        TV(double h) { super(h); }
        @Override double watts() { return 100; }
    }
    static class Washer extends Appliance implements SaverMode {
        Washer(double h) { super(h); }
        @Override double watts() { return 500; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim()); double total=0;
        for(int i=0;i<n;i++) {
            String[] parts=sc.nextLine().trim().split("\\s+");
            String type=parts[0]; double hours=Double.parseDouble(parts[1]);
            boolean saver=parts.length>2 && parts[2].equals("SAVER"); Appliance a;
            switch(type) {
                case "FRIDGE": a=new Fridge(hours); break;
                case "AC": a=new AC(hours); break;
                case "TV": a=new TV(hours); break;
                case "WASHER": a=new Washer(hours); break;
                default: throw new IllegalArgumentException("Unknown appliance");
            }
            if(saver && !(a instanceof SaverMode)) {
                System.out.println(type+": saver mode not supported"); continue;
            }
            double units=a.units();
            if(saver) units=((SaverMode)a).savedUnits(units);
            double cost=units*Appliance.UNIT_PRICE; total+=cost;
            System.out.printf(Locale.US,"%s: Units=%.2f Cost=%.2f%n",type,units,cost);
        }
        System.out.printf(Locale.US,"Total Cost: %.2f%n",total); sc.close();
    }
}
