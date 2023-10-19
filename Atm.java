import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        
            System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform:");
            int n = sc.nextInt();
while(true){
            switch (n) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Successfully  your withdraw money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to be Deposit:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    break;
                case 3:
                    System.out.print("Your Balance : " + balance);
                    break;
                default:
                    System.out.println("Exit");
                    break;
                
        }
        sc.close();
}

}
}