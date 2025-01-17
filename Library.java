import java.util.*;

class Library {
    String title;
    String author;
    int availableCopies;
    int totalCopies;

    void borrowbook() {
        if (availableCopies >= 1) {
            availableCopies--;
            System.out.println(title);
            System.out.println("Total Copies left after borrowing " + availableCopies);
        } else {
            System.out.println("Sorry Book is out of stock");
        }
    }

    void returnbook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println(title);
            System.out.println("Total Copies left returning " + availableCopies);
        } else {
            System.out.println("Not Possible");
        }
    }

    void run() {
        System.out.println("Enter 2 to borrow or 3 to return");
        Scanner s1 = new Scanner(System.in);
        int option;
        int limit;
        do {
            option = s1.nextInt();
            if (option == 2) {
                borrowbook();
            } else if (option == 3) {
                returnbook();
            } else {
                System.out.println("Enter correct option");
            }
            System.out.println("Enter 1 to continue with same book");
            limit = s1.nextInt();
        } while (limit == 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, x;
        // Object creation for book1
        Library b1 = new Library();
        b1.title = "The Tempest";
        b1.author = "William Shakespeare";
        b1.availableCopies = 5;
        b1.totalCopies = 5;
        // Object creation for book2
        Library b2 = new Library();
        b2.title = "Harry Potter";
        b2.author = "J. K. Rowling";
        b2.availableCopies = 5;
        b2.totalCopies = 5;
        // Object creation for book3
        Library b3 = new Library();
        b3.title = "As you like it";
        b3.author = "William Shakespeare";
        b3.availableCopies = 5;
        b3.totalCopies = 5;
        do {
            System.out.println("Please select the book");
            System.out.println("To choose The Tempest enter 1");
            System.out.println("To choose Harry Potter enter 2");
            System.out.println("To choose As you like it enter 3");
            n = sc.nextInt();
            switch (n) {

                case 1:
                    b1.run();
                    break;
                case 2:
                    b2.run();
                    break;
                case 3:
                    b3.run();
                    break;
                default:
                    System.out.println("Please enter valid number");
            }
            System.out.println("To go back to main menu press 1");
            x = sc.nextInt();
        } while (x == 1);

    }
}