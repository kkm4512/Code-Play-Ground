package equlas_hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualsTest {
    public static void main(String[] args) {
        객체_비교();
    }

    public static void 해쉬코드_오버라이딩_했을때와_독립적인_해쉬코드_얻기() {
        Set<Person> personList = new HashSet<>();
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1);
        Person person2 = new Person(p2);
        System.out.println("p1.hashCode() = " + p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("person1.hashCode() = " + person1.hashCode());
        System.out.println("person2.hashCode() = " + person2.hashCode());
        System.out.println("System.identityHashCode(person1) = " + System.identityHashCode(person1));
        System.out.println("System.identityHashCode(person2) = " + System.identityHashCode(person2));
    }

    public static void 해쉬코드_오버라이딩안하고_세트_사이즈_재보기() {
        Set<Person> personList = new HashSet<>();
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1);
        Person person2 = new Person(p2);
        personList.add(person1);
        personList.add(person2);
        System.out.println(personList.size());
    }

    public static void 해쉬코드_오버라이딩안하고_리스트_사이즈_재보기() {
        List<Person> personList = new ArrayList<>();
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1);
        Person person2 = new Person(p2);
        personList.add(person1);
        personList.add(person2);
        System.out.println(personList.size());
    }

    public static void 객체_해쉬코드_찍어보기() {
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1);
        Person person2 = new Person(p2);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

    public static void 객체_비교() {
        Person.PersonId p1 = new Person.PersonId(1L);
        Person.PersonId p2 = new Person.PersonId(1L);
        Person person1 = new Person(p1);
        Person person2 = new Person(p2);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }

    public static void String_비교() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // 주소 비교 false
        System.out.println(s1.equals(s2)); // 값 비교 true
    }
}
