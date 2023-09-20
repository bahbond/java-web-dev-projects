package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    int trackCount;

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.




    public CD(String name, int minSpeed, int maxSpeed, int trackCount) {
        super(name, minSpeed, maxSpeed);
        this.trackCount = trackCount;

    }

    @Override
    public void spinSpeed() {
        System.out.println("Spin speed of this CD is " + getMinSpeed() + " to " + getMaxSpeed());
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is worth a listen!" +trackCount + " tracks for your listening pleasure!");
    }

    @Override
    public void playLocation() {
        System.out.println("This spinning disc is excellent played in the car, or at home!");
    }
}
