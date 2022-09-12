package Ex2;

public class Customer {
    private String name;
    private BankInterface bankInterface;


    //constructor
    public Customer(String name, BankInterface bankInterface){
        this.name = name;
        this.bankInterface  = bankInterface;
    }

    public String getName() {
        return name;
    }

    public BankInterface getBankInterface() {
        return bankInterface;
    }
}
