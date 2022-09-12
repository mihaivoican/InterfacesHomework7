package Ex3;

public class Cat implements AnimalInterface{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }

    @Override
    public String talk() {
        return "cat-talking";
    }

    public String getName() {
        return name;
    }
}
