package Consumer;

public class Consumer {
    private Food food;

    void eat() {
        food.eat();
    }

    public Consumer(Food food){
	    this.food = food;
    }

    public static void main(String[] args) {
        Consumer consumer = new Consumer(new Hamburger());
        consumer.eat();
        consumer = new Consumer(new Chicken ());
        consumer.eat();
    }
}

interface Food {
    void eat();
}

class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹는다.");
    }
}

class Hamburger implements Food {
    @Override
    public void eat() {
        System.out.println("햄버거를 먹는다.");
    }
}