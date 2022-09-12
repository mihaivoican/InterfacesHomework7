package Ex1;

public class EmailProvider implements AdvertisorInterface{
    @Override
    public String getName() {
        return "Yahoo Mail";
    }

    @Override
    public int getTarif() {
        return 1;
    }

    @Override
    public String getChannel() {
        return "email";
    }

}
