package ua.in.dergachovda.atm;

public class Main {
	public static void main(String[] args) {
		Bank bank = new BankFirst();

		Person person = new Person("Ivan", "Ivanov", 23);
		Money cash = new Money();
		cash.addMoney(UAH.FIFTY, UAH.FIVE, UAH.ONE);
		person.addCash(cash);

		bank.createAccount(person, person.getAllCash());
//
//		ATM atm = new ATMFirst(firstBank);
//		atm.addMoney(UAH.FIFTY, UAH.FIVE, UAH.ONE);
//
//		atm.readCard(person.getCard());


	}
}