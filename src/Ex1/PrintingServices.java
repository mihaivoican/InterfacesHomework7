package Ex1;

public class PrintingServices implements AdvertisorInterface{
    private String name;
    private int tarif;
    private String channel;

    //constructor
    public PrintingServices(String name, int tarif, String channel){
        this.name = name;
        this.tarif = tarif;
        this.channel = channel;
    }


    //implementare metode din interfata
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTarif() {
        return tarif;
    }

    @Override
    public String getChannel() {
        return channel;
    }
}
