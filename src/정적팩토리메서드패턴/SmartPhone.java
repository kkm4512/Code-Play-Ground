package 정적팩토리메서드패턴;

class Galaxy implements SmartPhone {}
class IPhone implements SmartPhone {}
class Huawei implements SmartPhone {}

public interface SmartPhone {
    static SmartPhone getRandomPhone(){
        int price = 10000;
        if (price >= 5000) {
            new Galaxy();
        } else if (price >= 7000) {
            new IPhone();
        } else {
            new Huawei();
        }
        return null;
    }

    static Galaxy getGalaxy(){
        return new Galaxy();
    }

    static SmartPhone getApplePhone() {
        return new IPhone();
    }

    static SmartPhone getChinesePhone() {
        return new Huawei();
    }

}
