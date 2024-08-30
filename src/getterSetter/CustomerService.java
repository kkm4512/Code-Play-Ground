package getterSetter;

public class CustomerService {
    public static void main(String[] args) {
        Customer consumer = new Customer(10000L,3000L);
        consumer.printMembershipGrade();
    }
}

class Customer {
    private long usages;
    private long unitPrice;

    public Customer(long usages, long unitPrice) {
        this.usages = usages;
        this.unitPrice = unitPrice;
    }

    public void printMembershipGrade() {
        long charge = usages * unitPrice;
        if (charge >= 100000) {
            System.out.println("Gold");
        } else if (charge >= 50000) {
            System.out.println("Silver");
        } else {
            System.out.println("Bronze");
        }
    }
}
