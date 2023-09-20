package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String name, int minSpeed, int maxSpeed) {
        super(name, minSpeed, maxSpeed);
    }
    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public String toString() {
        return getName() + "has a minimum speed of " + getMinSpeed() + "and a maximum speed of " + getMaxSpeed() + ".";
    }

    @Override
    public void spinSpeed() {
        System.out.println("The spin speed is faster than CD's at " + getMinSpeed() + " to " + getMaxSpeed());
    }

    @Override
    public void describe() {
        System.out.println(getName() + "is definitely a film worth watching!");
    }

    @Override
    public void playLocation() {
        System.out.println("We recommend only playing this spinning disc at home.");
    }

}