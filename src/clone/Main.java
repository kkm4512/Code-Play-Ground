package clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human1 = new Human("human1",1, new Home("human1home1"));
        Human human2 = human1.clone();

        human1.setName("updated Human");
        human1.setAge(999);
        human1.getHome().setName("updated Home");

        System.out.println("human1.getName(): " + human1.getName());
        System.out.println("human2.getName(): " + human2.getName());
        System.out.println("human1.getAge(): " + human1.getAge());
        System.out.println("human2.getAge(): " + human2.getAge());
        System.out.println("human1.getHome().getName(): " + human1.getHome().getName());
        System.out.println("human2.getHome().getName(): " + human2.getHome().getName());
    }
}
