package Ex2;

public interface BankInterface {
    long addMoney(long depunere);      //implicit in interfete sunt public toate metodele
    long removeMoney (long retragere);

    String getBankName();

    String getBankAccount();

    long getSold();
}
