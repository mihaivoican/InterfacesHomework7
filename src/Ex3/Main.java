package Ex3;

public class Main {
    public static void main(String[] args) {
        Cat pisica = new Cat("Luna");
        System.out.println(String.format("Pisica %s stie sa: %s, %s, %s",pisica.getName(),pisica.eat(),pisica.talk(),pisica.walk()));
        Dog caine = new Dog("Azorel");
        System.out.println(String.format("Cainele %s stie sa: %s, %s, %s",caine.getName(),caine.eat(),caine.talk(),caine.walk()));
        Mouse soarece = new Mouse("Chitz");
        System.out.println(String.format("Soarecele %s stie sa: %s, %s, %s",soarece.getName(),soarece.eat(),soarece.talk(),soarece.walk()));


    }
}
