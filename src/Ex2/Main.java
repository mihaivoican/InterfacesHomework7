package Ex2;

public class Main {
    public static void main(String[] args) {
        Customer client1 = new Customer("Geo",new ING("ING","ROING000001"));
        //situatia initiala
        System.out.println(String.format("%s are la banca %s contul %s cu soldul %s. ",
                client1.getName(),
                client1.getBankInterface().getBankName(),
                client1.getBankInterface().getBankAccount(),
                client1.getBankInterface().getSold()));

        //depun bani 100
        long suma = 100;
        client1.getBankInterface().addMoney(suma);
//        System.out.println(String.format("%s are la banca %s contul %s cu soldul %s. ",
//                client1.getName(),
//                client1.getBankInterface().getBankName(),
//                client1.getBankInterface().getBankAccount(),
//                client1.getBankInterface().getSold()));
        //retrag 150
        suma=150;
        client1.getBankInterface().removeMoney(suma);
        //retrag 50
        suma =50;
        client1.getBankInterface().removeMoney(suma);
//        System.out.println(String.format("%s are la banca %s contul %s cu soldul %s. ",
//                client1.getName(),
//                client1.getBankInterface().getBankName(),
//                client1.getBankInterface().getBankAccount(),
//                client1.getBankInterface().getSold()));
//------------------------------------------------------------------------------
        //al 2-lea cont
        Customer client2 = new Customer("Geo",new BT("ROBT01010101"));
        //cont 2 situatia initiala
        System.out.println(String.format("%s are la banca %s contul %s cu soldul %s. ",
                client2.getName(),
                client2.getBankInterface().getBankName(),
                client2.getBankInterface().getBankAccount(),
                client2.getBankInterface().getSold()));

        client2.getBankInterface().addMoney(-100);
        client2.getBankInterface().addMoney(200);
        client2.getBankInterface().removeMoney(50);
//---------------------------------------------------------------------------
        //al 3lea cont
        Customer client3 = new Customer("Ion",new BRD("ROBRD898989"));
        System.out.println(String.format("%s are la banca %s contul %s cu soldul %s. ",
                client3.getName(),
                client3.getBankInterface().getBankName(),
                client3.getBankInterface().getBankAccount(),
                client3.getBankInterface().getSold()));
        client3.getBankInterface().addMoney(10);
        client3.getBankInterface().addMoney(10);
        client3.getBankInterface().removeMoney(-1);
        client3.getBankInterface().removeMoney(9);

    }
}
