package Ex3;

public class Dog implements AnimalInterface{
    private String name;
    final String tip= "dog";

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String walk() {
        return tip + "-walking";
    }

    @Override
    public String eat() {
        return tip + "-eating";
    }

    @Override
    public String talk() {
        return tip + "-talking";
    }

    public String getName() {
        return name;
    }
}
