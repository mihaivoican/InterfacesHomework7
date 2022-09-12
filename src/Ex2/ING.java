package Ex2;

public class ING implements BankInterface{
    private String bankName;
    private String bankAccount;
    private long sold = 0;

//constructor

    public ING(String bankName, String bankAccount) {
        this.bankName = bankName;
        this.bankAccount = bankAccount;
    }

    @Override
    public String getBankAccount() {
        return this.bankAccount;
    }

    @Override
    public long getSold() {
        return sold;
    }

    @Override
    public String getBankName() {
        return bankName;
    }




    @Override
    public long addMoney(long depunere) {
        if (depunere > 0) {
            System.out.println(String.format("Ati depus %s. Sold actual:%s ",depunere,sold+depunere));
            return sold += depunere;
        }
        return sold;
    }

    @Override
    public long removeMoney(long retragere) {
        if (sold > 0) {
            if (retragere > 0) {
                if (sold >= retragere) {
                    System.out.println(String.format("Ati retras suma de %s. Sold actual %s", retragere, sold-retragere));
                    return sold - retragere;
                } else {
                    System.out.println(String.format("Suma dorita %s e mai mare decat soldul %s. Fonduri insuficiente.",retragere,sold));
                    return sold;
                }
            } else {
                System.out.println("Suma de retras trebuie sa fie strict pozitiva!");
                return sold;
            }
        }
        System.out.println("Sold " + sold + "Fonduri insuficiente");
        return 0;
    }
}
