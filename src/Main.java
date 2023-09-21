public class Main {
    public static void main(String[] args) {

                Car car = new Car("car1", 4);
                Car car2 = new Car("car2", 4);

                Truck truck = new Truck("truck1", 6);
                Truck truck2 = new Truck("truck2", 8);

                Bicycle bicycle = new Bicycle("bicycle1", 2);
                Bicycle bicycle2 = new Bicycle("bicycle2", 2);

                ServiceStation station = new ServiceStation();
                station.service(bicycle, null, null);
                station.service(bicycle2, null, null);
                station.service(null, car, null);
                station.service(null, car2, null);
                station.service(null, null, truck);
                station.service(null, null, truck2);
                //!
            }
        }