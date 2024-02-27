package in.kgcoding;

import java.util.Scanner;

 class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;



    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
                + balance + "]";
    }


    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
   

    public void deposit(int deposit){
        if(deposit < 1) 
            System.out.println("Invalid value");
        else
            this.balance += deposit ;
    }

    public void withdraw(int withdraw){

        if(this.balance >= withdraw){
            this.balance -= withdraw;
        }
        else
            System.out.println("Dont have enough balance to withdraw");
    }

    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount atul = new BankAccount(1,"Atul Sharma", 6000);

        System.out.println(atul);

        atul.deposit(10000);
        System.out.println(atul);

        atul.withdraw(500);
        System.out.println(atul);
    }
}
