package org.example;

public class MarketingPlan {

    private Subscription subscription;
    private Tariff tariff;

    public MarketingPlan(GUIFactory factory) {
        subscription = factory.printInfo();
        tariff = factory.printPlan();
    }

    public void printInfo() {
        subscription.printInfo();

    }

    public void printPlan(){
        tariff.printPlan();
    }


    //public void setupPlan() {

      //  Subscription subscription = new AndroidSubscription();

        //subscription.printInfo();

        //Tariff tariff = new AndroidTariff();

        //tariff.printPlan();

   // }
}
