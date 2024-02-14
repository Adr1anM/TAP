public class Main {

    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle(2012,"Opel");
        vehicle.displayInfo();
        System.out.println("-----------------------------------------");

        Car firstcar = new Car(2020,"Nissan","Almera",50,2500,4);
        firstcar.displayInfo();
        System.out.println("-----------------------------------------");

        Car secondcar = new Car(2020,"Nissan","Almera");
        secondcar.displayInfo();
        System.out.println("-----------------------------------------");

        Vehicle derivedCar = new Car();
        derivedCar.displayInfo();

    }
}
