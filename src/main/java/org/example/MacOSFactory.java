package org.example;

public class MacOSFactory implements GUIFactory{
    @Override
    public Subscription printInfo() {
        return new MacOSSubscription();
    }

    @Override
    public Tariff printPlan() {
        return new MacOSTariff();
    }
}
