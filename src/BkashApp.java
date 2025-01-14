import java.util.Scanner;

public class BkashApp {
        private double balance;
        private final int PIN = 5321;
        Scanner input = new Scanner(System.in);

        public BkashApp(double balance) {
        this.balance = balance;
    }

        public void checkPin() {
        System.out.print("Enter your pin: ");
        int pin = input.nextInt();
        if (pin == PIN) {
            menu();
        } else {
            System.out.println("Incorrect PIN");
            checkPin();
        }
    }

        public void menu() {
        System.out.println("Welcome to bKash Service");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Send Money");
        System.out.println("3. Cash Out");
        System.out.println("4. Mobile Recharge");
        System.out.println("5. Cash In");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            accountBalance();
        } else if (choice == 2) {
            sendMoney();
        } else if (choice == 3) {
            cashOut();
        } else if (choice == 4) {
            mobileRecharge();
        } else if (choice == 5) {
            cashIn();
        } else if (choice == 6) {
            return;
        } else {
            System.out.println("Invalid choice");
            menu();
        }
    }

        public void cashIn(){
            System.out.print("Enter cash in amount: ");
            double cashInAmount = input.nextDouble();
            if (cashInAmount<=0){
                System.out.println("Enter valid amount");
                menu();
            }else {
                balance = balance + cashInAmount;
                System.out.println("Cash In successfully");
                menu();
            }
        }

        public void mobileRecharge() {
        int minValue = 1300000000;
        int maxValue = 1999999999;
        System.out.print("Enter phone number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter recharge amount: ");
        int sendAmount = input.nextInt();
        if (accountNumber < minValue || accountNumber > maxValue) {
            System.out.println("Invalid phone number");
            menu();
        } else {
            if (sendAmount > balance) {
                System.out.println("Insufficient balance");
                menu();
            } else if (sendAmount <= 0) {
                System.out.println("Invalid amount");
                menu();
            } else {
                balance = balance - sendAmount;
                System.out.println("Recharge successfully");
                menu();
            }
        }
    }

        public void cashOut() {
        int minValue = 1300000000;
        int maxValue = 1999999999;
        System.out.print("Enter agent account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter amount: ");
        int sendAmount = input.nextInt();
        if (accountNumber < minValue || accountNumber > maxValue) {
            System.out.println("Invalid account number");
            menu();
        } else {
            if (sendAmount > balance) {
                System.out.println("Insufficient balance");
                menu();
            } else if (sendAmount <= 0) {
                System.out.println("Invalid amount");
                menu();
            } else {
                balance = balance - sendAmount;
                System.out.println("Cash Out successfully");
                menu();
            }
        }
    }

        public void accountBalance() {
            System.out.println("Balance: " + balance);
            menu();
        }

        public void sendMoney () {
            int minValue = 1300000000;
            int maxValue = 1999999999;
            System.out.print("Enter receiver account number: ");
            int accountNumber = input.nextInt();
            System.out.println("Enter amount: ");
            int sendAmount = input.nextInt();
            if (accountNumber < minValue || accountNumber > maxValue) {
                System.out.println("Invalid account number");
                menu();
            } else {
                if (sendAmount > balance) {
                    System.out.println("Insufficient balance");
                    menu();
                } else if (sendAmount <= 0) {
                    System.out.println("Invalid amount");
                    menu();
                } else {
                    balance = balance - sendAmount;
                    System.out.println("Sent successfully");
                    menu();
                }
            }

        }
    }
