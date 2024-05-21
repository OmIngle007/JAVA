import java.util.*;

class Bank {

        Scanner scanner = new Scanner(System.in); 

        // Information of our costumer
        public void getCustomerInfo() {
            System.out.println(" ");
            System.out.println("Enter your Bank Customer ID: ");
            String bankID = scanner.next();
        
            boolean isRegistered = false;
            int customerID = 0;

            for (customerID = 0; customerID < 1000; customerID++) {
                if (("JKSBI" + customerID).equals(bankID)) {
                    isRegistered = true;
                    break;
                }
            }
        
            if (isRegistered) {
                System.out.println("Welcome to SBI Bank Jammu.");
            } else {
                System.out.println("Sorry, you are not registered yet. Do registration and then you can avail all our bank services.");
                return;
            }

            creditMoney();
            debitMoney();
        }

        // To credit money
        public void creditMoney() {
            System.out.println(" ");
            System.out.print("Enter the amount available in your account: ");
            int avalAmt = scanner.nextInt();

            if(avalAmt >= 1_00_000) {
                System.out.println("You can't credit money as the limit reached.");
            }
            else {
                System.out.println("You can credit money upto the limit i.e. One Lac.");
            }
        }

        // To debit money 
        public void debitMoney() {
            System.out.println(" ");
            System.out.println("Enter the amount you want to debit: ");
            int debtAmt = scanner.nextInt();
                
            if(debtAmt > 1_00_000) {
                System.out.println("You can't debit money as you have limit amount.");
            }
            else if(debtAmt == 1_00_000) {
                System.out.println("You can debt money.");
            }
            else {
                System.out.println("You can debt money.");
            }  
        }

        public static void main(String[] args) {
            Bank bank = new Bank();
            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.println(" ");
                System.out.println("Enter your choice from below: " + "\n" + "1) Customer Info" + "\n" + "2) Credit Money"+ "\n" + 
                "3) Debit Money");
                System.out.println(" ");
                int choice = sc.nextInt();

                switch(choice) {
                case 1: bank.getCustomerInfo();
                break;
                
                case 2: bank.creditMoney();
                break;

                case 3: bank.debitMoney();
                break;

                default: System.out.println("You enter wrong choice");
                break;
                }

                if(choice < 1 || choice > 3) {
                    break;
                }
            }
        }
}