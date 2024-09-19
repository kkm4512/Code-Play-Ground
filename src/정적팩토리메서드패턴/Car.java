package 정적팩토리메서드패턴;

public class Car {
    private String brand;
    private String color = "black";

    // 생성자 숨기기
    private Car() {}

    // 생성자 숨기기
    private Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // 매개 변수 하나는 from 네이밍
    public static Car brandFrom(String brand){
        return new Car(brand,"black");
    }

    // 매개변수 2개이상은 of 네이밍
    public static Car brandColorFrom(String brand, String color){
        return new Car(brand,color);
    }
}
