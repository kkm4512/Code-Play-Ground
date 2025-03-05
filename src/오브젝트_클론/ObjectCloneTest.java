package 오브젝트_클론;

public class ObjectCloneTest {
    public static void main(String[] args) {

    }
}


class Car {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("1네임", "1칼라");
        Car car2 = (Car) car.clone();
    }
}