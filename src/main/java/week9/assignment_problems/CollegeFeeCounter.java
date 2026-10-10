package week9.assignment_problems;

import java.util.*;

public class CollegeFeeCounter {
    interface BusUser {
        double TRANSPORT_FEE=12000;
        default double transportFee() { return TRANSPORT_FEE; }
    }
    static abstract class Student {
        static final double NORMAL_TUITION=40000;
        String name;
        Student(String name) { this.name=name; }
        abstract double tuition();
        double extraFee() { return 0; }
        final double totalFee() {
            return tuition()+extraFee()+(this instanceof BusUser ? ((BusUser)this).transportFee() : 0);
        }
    }
    static class DayScholar extends Student implements BusUser {
        DayScholar(String n) { super(n); }
        @Override double tuition() { return NORMAL_TUITION; }
    }
    static class Hosteller extends Student {
        Hosteller(String n) { super(n); }
        @Override double tuition() { return NORMAL_TUITION; }
        @Override double extraFee() { return 60000; }
    }
    static class Scholar extends Student implements BusUser {
        Scholar(String n) { super(n); }
        @Override double tuition() { return NORMAL_TUITION/2; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++) {
            String type=sc.next(),name=sc.next(); Student student;
            switch(type) {
                case "DAY_SCHOLAR": student=new DayScholar(name); break;
                case "HOSTELLER": student=new Hosteller(name); break;
                case "SCHOLAR": student=new Scholar(name); break;
                default: throw new IllegalArgumentException("Unknown student type");
            }
            double fee=student.totalFee(); total+=fee;
            System.out.printf(Locale.US,"%s: %.2f%n",student.name,fee);
        }
        System.out.printf(Locale.US,"Total Collected: %.2f%n",total); sc.close();
    }
}
