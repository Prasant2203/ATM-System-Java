import java.util.Scanner;
public class ATM {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to APNA ATM !!!\n");

        //pin-locking
        int pin = 1234;
        for(int i=2; i>-1; i--){
            System.out.print("Enter your 4-digits PIN: ");
            int p = sc.nextInt();
            if(p != pin){
                if(i==0){
                    System.out.println("Pin incorrect 3 times.\n");
                    System.exit(0);
                }
                System.out.println("Invalid pin.\n" + i + " chances left...\n");
            }else{
                break;
            }
        }

        //balance given at start
        double bal = 1000;
    
        while(true){

            //ATM menu
            System.out.println();
            System.out.println("====ATM Menu====");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("\nEnter your choice(1-4): ");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    //show available balance
                    System.out.println("Balance: " + bal);      
                    System.out.println();
                    break;
                case 2:
                    //Deposite amt                                     
                    System.out.print("Enter amount: ");       
                    double dep = sc.nextDouble();
                    if(dep < 0){
                        System.out.println("Invalid amount. Deposite must be greater than 0.\n");
                        break;
                    }
                    bal += dep;
                    System.out.println("Current balance is: " + bal);
                    System.out.println();
                    break;
                case 3:
                    //withdraw amt
                    System.out.print("Enter amount: ");
                    double wit = sc.nextDouble();
                    if(wit > bal){
                        System.out.println("Insufficient balance!\n");
                        break;
                    }
                    bal -= wit;
                    System.out.println("Current balance is: " + bal);
                    System.out.println();
                    break;
                case 4:
                    //Exit
                    System.exit(0);
                default:
                    //Invalid user input
                    System.out.println("Invalid choice");
            }
        }
    }
}