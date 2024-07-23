package de.vimo;

public class Car {
    private SilverWheel silverWheel;
    private BlackWheel blackWheel;
    public Car(String wheelType) {
        if(wheelType == "silverWheel") {
            SilverWheel wheelFrontRightSilver = new SilverWheel();
            SilverWheel wheelFrontLeftSilver = new SilverWheel();
            SilverWheel wheelRearRightSilver = new SilverWheel();
            SilverWheel wheelRearLeftSilver = new SilverWheel();
        }
        if(wheelType == "blackWheel") {
            BlackWheel wheelFrontRightBlack = new BlackWheel();
            BlackWheel wheelFrontLeftBlack = new BlackWheel();
            BlackWheel wheelRearRightBlack = new BlackWheel();
            BlackWheel wheelRearLeftBlack = new BlackWheel();
        }
    }
    public Car(BlackWheel blackWheel) {
        this.blackWheel = blackWheel;
    }

    BlackSeat driverSeat = new BlackSeat();
    BlackSeat passengerSeat = new BlackSeat();

    public BlackSeat getDriverSeat() {
        return driverSeat;
    }
    public String getSilverWheel() {
        return silverWheel.getSilverWheel();
    }
    public String getBlackWheel() {
        return blackWheel.getBlackWheel();
    }

}
