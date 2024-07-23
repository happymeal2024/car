package de.vimo;

public class CarTest
{

    public static void main(String[] args )
    {
        SilverWheel silverWheel = new SilverWheel();
        BlackWheel blackWheel = new BlackWheel();
        Car car = new Car("silverWheel");
        Car carBlack = new Car(blackWheel);

        System.out.println(car.getSilverWheel());

        System.out.println(carBlack.getBlackWheel());

        BlackSeat driverSeat = carBlack.getDriverSeat();
        driverSeat.sitDown();
        System.out.println(carBlack.getDriverSeat().isSitDown());
        driverSeat.standUp();
        System.out.println(driverSeat.isSitDown());
    }
}
