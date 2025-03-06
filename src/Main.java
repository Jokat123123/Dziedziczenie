public class Main {
    public static void main(String[] args) {
        VehicleRegistry registry = new VehicleRegistry();

        Owner owner1 = new Owner("Jan Kowalski");
        Owner owner2 = new Owner("Anna Nowak");

        Vehicle car = new LandVehicle("Toyota Corolla", 2020, owner1, 4);
        Vehicle boat = new WaterVehicle("Yacht Sunseeker", 2018, owner2, 25.5);
        Vehicle plane = new AirVehicle("Cessna 172", 2015, owner1, 4000);

        registry.registerVehicle(car);
        registry.registerVehicle(boat);
        registry.registerVehicle(plane);

        registry.displayAllVehicles();
    }
}
