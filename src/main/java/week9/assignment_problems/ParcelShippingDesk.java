package week9.assignment_problems;

import java.util.*;

public class ParcelShippingDesk {
    interface Insurable {
        double declaredValue();
        default double insurance() { return declaredValue()*0.02; }
    }
    static abstract class Parcel {
        double weight,value;
        Parcel(double weight,double value) { this.weight=weight; this.value=value; }
        abstract double charge();
    }
    static class Standard extends Parcel {
        Standard(double w,double v) { super(w,v); }
        @Override double charge() { return 40+weight*10; }
    }
    static class Express extends Parcel implements Insurable {
        Express(double w,double v) { super(w,v); }
        @Override double charge() { return 80+weight*15; }
        public double declaredValue() { return value; }
    }
    static class Fragile extends Standard implements Insurable {
        Fragile(double w,double v) { super(w,v); }
        @Override double charge() { return super.charge()+50; }
        public double declaredValue() { return value; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
        int n=sc.nextInt(); double grand=0;
        for(int i=0;i<n;i++) {
            String type=sc.next(); double w=sc.nextDouble(),v=sc.nextDouble(); Parcel p;
            switch(type) {
                case "STANDARD": p=new Standard(w,v); break;
                case "EXPRESS": p=new Express(w,v); break;
                case "FRAGILE": p=new Fragile(w,v); break;
                default: throw new IllegalArgumentException("Unknown parcel");
            }
            double c=p.charge(),insurance=p instanceof Insurable ? ((Insurable)p).insurance() : 0;
            grand+=c+insurance;
            System.out.printf(Locale.US,"%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",type,c,insurance,c+insurance);
        }
        System.out.printf(Locale.US,"Grand Total: %.2f%n",grand); sc.close();
    }
}
