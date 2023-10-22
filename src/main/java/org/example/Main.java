package org.example;

public class Main {
    public static void main(String[] args) {
        MarketingPlan marketingPlan = new MarketingPlan(new AndroidFactory());
        marketingPlan.printInfo();
        marketingPlan.printPlan();

        MarketingPlan marketingPlan1 = new MarketingPlan(new MacOSFactory());
        marketingPlan1.printInfo();
        marketingPlan1.printPlan();

    }
}