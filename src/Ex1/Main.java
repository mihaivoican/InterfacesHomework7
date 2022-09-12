package Ex1;

public class Main {
    public static void main(String[] args) {
//        EmailProvider channel1 = new EmailProvider();
//        System.out.println(String.format("Firma %s va face reclama prin %s pentru %d $ pe email",channel1.getName(),channel1.getChannel(),channel1.getTarif()));
        Contract contract1 = new Contract("Firma SRL", new EmailProvider());
        System.out.println(String.format("%s va face reclama pe %s cu ajutorul %s la pretul de %s$ per %s",
                contract1.getClientName(), contract1.getAdvertisor().getChannel(), contract1.getAdvertisor().getName(), contract1.getAdvertisor().getTarif(), contract1.getAdvertisor().getChannel()));
        Contract contract2 = new Contract("Firma SRL", new PrintingServices("StarPrint SA", 20, "poster"));
        System.out.println(String.format("%s va face reclama pe %s cu ajutorul %s la pretul de %s$ per %s",
                contract2.getClientName(), contract2.getAdvertisor().getChannel(), contract2.getAdvertisor().getName(), contract2.getAdvertisor().getTarif(), contract2.getAdvertisor().getChannel()));
        Facebook fb = new Facebook("Facebook Co", 5, "postare", 5);
        Contract contract3 = new Contract("Firma SRL", fb);
        System.out.println(String.format("%s va face reclama prin %s cu ajutorul %s la pretul de %s$ per %s. Discount %s$ la 5 postari",
                contract3.getClientName(),
                contract3.getAdvertisor().getChannel(),
                contract3.getAdvertisor().getName(),
                contract3.getAdvertisor().getTarif(),
                contract3.getAdvertisor().getChannel(),
                fb.getDiscount()
        ));
    }
}
