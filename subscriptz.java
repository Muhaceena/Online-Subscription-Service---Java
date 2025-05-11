import java.util.Scanner;
public class subscriptz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================================");
        System.out.println("Welcome to SubScriptz - Your Smart Subscription Assistant!");
        System.out.println("==========================================================");

        System.out.println("Please choose an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print(">");
        int option = sc.nextInt();
        sc.nextLine();

        if(option == 1){
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            System.out.print("Enter your password: ");
            String password = sc.nextLine();
            System.out.println("Account created successfully!");
            System.out.println("Please login to continue");
        }
        if(option == 3){
        System.out.println("Exited successfully.");
        return;
}
            System.out.print("Enter your name: ");
            String loginname = sc.nextLine();
            System.out.print("Enter your password: ");
            String loginpassword = sc.nextLine();
            System.out.println("Login successfully! Welcome" + loginname);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n----------------------------");
            System.out.println("Main Menu");
            System.out.println("----------------------------");
            System.out.println("1. View all subscription categories");
            System.out.println("2. Subscribe to a plan");
            System.out.println("3. My subscriptions");
            System.out.println("4. Renew subscription");
            System.out.println("5. Cancel subscription");
            System.out.println("6. View payment history");
            System.out.println("7. Update profile");
            System.out.println("8. Logout");
            System.out.print("> ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                System.out.println("\nCategories available:");
                System.out.println("1. Magazines");
                System.out.println("2. Software tools");
                System.out.println("3. Music streaming");
                System.out.println("4. Video streaming");
                System.out.println("5. Gaming pass");
                System.out.println("6. E-Book library");
                System.out.println("7. Fitness & Wellness");
                System.out.println("8. Online courses");
                break;

                case 2:
                System.out.println("\nSelect a category to view plans:");
                int categorychoice = sc.nextInt();
                sc.nextLine();
                if (categorychoice >= 1 && categorychoice <= 5) {
                System.out.println("\n-- Selected Category " + categorychoice + " Plans --");

                switch (categorychoice) {
                            case 1: 
                                System.out.println("1. Time Magazine - 100/month");
                                System.out.println("2. National Geographic - 150/month");
                                break;
                            case 2: 
                                System.out.println("1. CodePro IDE - 499/year");
                                System.out.println("2. WriterPro - 199/year");
                                break;
                            case 3: 
                                System.out.println("1. Spotify Premium - 119/month");
                                System.out.println("2. Apple Music - 120/month");
                                break;
                            case 4: 
                                System.out.println("1. Netflix - 499/month");
                                System.out.println("2. Disney+ Hotstar - 399/month");
                                break;
                            case 5: 
                                System.out.println("1. Xbox Game Pass - 499/month");
                                System.out.println("2. PlayStation Plus - 349/month");
                                break;
                        }
                        System.out.print("Enter plan number to subscribe: ");
                        int planchoice = sc.nextInt();
                        sc.nextLine();
                        System.out.println("You have subscribed to plan " + planchoice + ".");
                    } else {
                        System.out.println("Sorry, subscription is not available for this category.");
                    }
                    break;

                case 3:
                    System.out.println("\n My subscriptions");
                    System.out.println("1. CodePro IDE - Valid till: 11-May-2026");
                    break;

                case 4:
                    System.out.println("\nNo subscriptions to renew right now.");
                    break;

                case 5:
                    System.out.println("\nDo you want to cancel your subscription? (yes/no)");
                    String cancelChoice = sc.nextLine();
                    if (cancelChoice.equals("yes")) {
                        System.out.println("Subscription cancelled successfully.");
                    } else {
                        System.out.println("Cancelled action.");
                    }
                    break;    
                
                    case 6:
                    System.out.println("\nPayment history");
                    System.out.println("1. CodePro IDE - ₹499 - 11-May-2025");
                    break;

                case 7:
                    System.out.println("\nProfile settings:");
                    System.out.println("1. Change password");
                    System.out.println("2. Update email");
                    System.out.print("> ");
                    int profileChoice = sc.nextInt();
                    sc.nextLine(); 

                    if (profileChoice == 1) {
                        System.out.print("Enter new password: ");
                        String newPassword = sc.nextLine();
                        System.out.println("Password updated successfully.");
                    } else if (profileChoice == 2) {
                        System.out.print("Enter new email: ");
                        String newEmail = sc.nextLine();
                        System.out.println("Email updated successfully.");
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                       
                case 8:
                    System.out.println("Logging out... Thank you for using SubScriptz!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
}
}

