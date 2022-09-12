package Ex1;

public class Contract {
    private String clientName;
    private AdvertisorInterface advertisor;

    //constructor
    public Contract(String client, AdvertisorInterface advertisor){
        clientName = client;
        this.advertisor = advertisor;
    }
    public String getClientName(){
        return this.clientName;
    }
    public AdvertisorInterface getAdvertisor(){
        return this.advertisor;
    }
}
