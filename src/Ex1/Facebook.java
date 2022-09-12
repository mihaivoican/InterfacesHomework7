package Ex1;

public class Facebook implements AdvertisorInterface{
    private String name;
    private int tarif;
    private String channel;
    private int discount;

    //constructor
    public Facebook(String name, int tarif, String channel,int discount){
        this.name = name;
        this.tarif = tarif;
        this.channel = channel;
        this.discount = discount;
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

    //    metoda proprie
    public int getDiscount(){
        return discount;
    }

}
