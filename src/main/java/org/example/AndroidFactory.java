package org.example;

public class AndroidFactory implements GUIFactory{
    @Override
    public Subscription printInfo() {
        return new AndroidSubscription();
    }

    @Override
    public Tariff printPlan() {
        return new AndroidTariff();
    }
}
