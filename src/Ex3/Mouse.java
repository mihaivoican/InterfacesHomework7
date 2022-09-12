package Ex3;

public class Mouse implements AnimalInterface{
private String name;
    final String tip="mouse";

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String walk() {
        return tip + "-walking";
    }

    @Override
    public String eat() {
        return tip +"-eating" ;
    }

    @Override
    public String talk() {
        return tip + "-talking";
    }

    public String getName() {
        return name;
    }
}
