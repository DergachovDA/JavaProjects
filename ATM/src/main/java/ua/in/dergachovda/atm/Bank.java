package ua.in.dergachovda.atm;

public interface Bank {
    public void createAccount(Person person, Money money);
    public String getName();
}
