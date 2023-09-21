public class ServiceStation {

    public void service(Bicycle bicycle, Car car, Truck truck) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
        } for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
        bicycle.service();
        car.service();
        truck.service();
    }
}




