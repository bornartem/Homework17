public class Car extends Engine {

    public String modelName;
    public int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
//!
    }
}