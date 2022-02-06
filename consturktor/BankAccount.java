package consturktor;

public class BankAccount {
    int id = 324;
    String name = "Vasya";
    double balance = 546;


    void topUp(double replenishmentAmount) {
        System.out.println("Баланс до пополения : " + balance);
        System.out.println("Баланс пополняется на : " + replenishmentAmount);
        balance += replenishmentAmount;
        System.out.println("Баланс после пополнения : " + balance);
        System.out.println(" ");
    }

    void sniuatiesSczheta(double withdrawalAmount) {
        System.out.println("Баланс до снятия : " + balance);
        System.out.println("Баланс уменьшается на : " + withdrawalAmount);
        balance -= withdrawalAmount;
        System.out.println("Баланс после снятия : " + balance);
        System.out.println(" ");
    }


}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.topUp(24.23);
        MyAccount.sniuatiesSczheta(435.5);

    }
}