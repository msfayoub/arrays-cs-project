package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions=new double[1000];
    int counter=0;

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Deposited amount is negative");
            return;
        }
        currentBalance+=amount;
        transactions[this.counter]=amount;
        this.counter++;
        System.out.println("Name : "+this.name+" ,Deposited amount : "+amount+" ,New balance : "+currentBalance);
    }

    public void withdraw(double amount){
        if (amount<=this.currentBalance && amount>=0){
            currentBalance-=amount;
            transactions[this.counter]=-amount;
            this.counter++;
            return;
        }
        System.out.println("Unsuccessful transaction.");
        return;
    }

    public void displayTransactions(){
        for (int i=0;i<this.counter;i++){
            System.out.print(this.transactions[i]+" ");
        }
    }

    public void displayBalance(){
        System.out.println("Balance : "+this.currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
