package ATM;

import java.util.Scanner;

public class ATMSim {
    public static void main(String[] args) {
        String[] users = {"Aron", "Arjohn"};
        String[] passwords = {"pass1", "pass2"};
        double[] balances = {1000.0, 1500.0};
        int[] pins = {1111, 2222};

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM Center!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice : ");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("Username: ");
                String username = scan.next();
                System.out.print("Password: ");
                String password = scan.next();
                int userIndex = findUserIndex(username, users);

                if (userIndex != -1 && passwords[userIndex].equals(password)) {
                    System.out.println("Welcome " + username + "!");

                    int currentAccount = userIndex;

                    while (true) {
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Change PIN");
                        System.out.println("5. Logout");
                        System.out.print("Enter choice: ");
                        int option = scan.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("Your balance: $" + balances[currentAccount]);
                                break;
                            case 2:
                                System.out.print("Enter the deposit amount: $");
                                double depositAmount = scan.nextDouble();
                                if (depositAmount > 0) {
                                    balances[currentAccount] += depositAmount;
                                    System.out.println("Deposit successful. New balance: $" + balances[currentAccount]);
                                } else {
                                    System.out.println("Invalid amount. Please enter a positive value.");
                                }
                                break;
                            case 3:
                                System.out.print("Enter the withdrawal amount: $");
                                double withdrawalAmount = scan.nextDouble();
                                if (withdrawalAmount > 0 && withdrawalAmount <= balances[currentAccount]) {
                                    balances[currentAccount] -= withdrawalAmount;
                                    System.out.println("Withdrawal successful. New balance: $" + balances[currentAccount]);
                                } else {
                                    System.out.println("Invalid amount or insufficient balance.");
                                }
                                break;
                            case 4:
                                System.out.print("Enter a new PIN: ");
                                int newPin = scan.nextInt();
                                pins[currentAccount] = newPin;
                                System.out.println("PIN changed successfully.");
                                break;
                            case 5:
                                System.out.println("Logout successful.");
                                currentAccount = -1;
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                        }

                        if (currentAccount == -1) {
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            } else if (choice == 2) {
                System.out.println("Exiting prompt. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Re-enter prompt.");
            }
        }
    }
    private static int findUserIndex(String username, String[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }
}
