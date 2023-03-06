package day31_Constructor;

public class CapitalOne {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 123456789L);
        System.out.println(account1);


        account1.deposit(1000);
        account1.checkBalance();

        account1.withDraw(900);
        account1.checkBalance();
        System.out.println(account1);



        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 987456123L);
        System.out.println(account2);

        account2.deposit(10000);

    }
}
