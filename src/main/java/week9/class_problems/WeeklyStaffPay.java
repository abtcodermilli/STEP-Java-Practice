package week9.class_problems;

import java.util.*;

public class WeeklyStaffPay {
    static abstract class Staff {
        String name;
        abstract double pay();
    }
    static class FullTime extends Staff {
        double salary;
        FullTime(String name, double salary) { this.name=name; this.salary=salary; }
        @Override double pay() { return salary; }
    }
    static class Hourly extends Staff {
        double hours, rate;
        Hourly(String name, double hours, double rate) { this.name=name; this.hours=hours; this.rate=rate; }
        @Override double pay() { return Math.min(hours,40)*rate + Math.max(0,hours-40)*rate*1.5; }
    }
    static class Intern extends Staff {
        double stipend;
        Intern(String name, double stipend) { this.name=name; this.stipend=stipend; }
        @Override double pay() { return stipend; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            Staff staff;
            switch(type) {
                case "FULLTIME": staff=new FullTime(name,sc.nextDouble()); break;
                case "HOURLY": staff=new Hourly(name,sc.nextDouble(),sc.nextDouble()); break;
                case "INTERN": staff=new Intern(name,sc.nextDouble()); break;
                default: throw new IllegalArgumentException("Unknown staff type");
            }
            double pay=staff.pay(); total+=pay;
            System.out.printf(Locale.US,"%s: %.2f%n",staff.name,pay);
        }
        System.out.printf(Locale.US,"Total Payroll: %.2f%n",total);
        sc.close();
    }

}
