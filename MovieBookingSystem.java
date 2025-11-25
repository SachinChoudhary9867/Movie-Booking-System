import java.util.*;

public class MovieBookingSystem {

    static void displaySeats(char[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] movies = {
            "Dhurandhar",
            "Toxic",
            "Ramayan",
            "Maddock Horror Comedy Universe: Bhediya 2",
            "YRF Alpha",
            "Avengers: Doomsday",
            "Spiderman: Brand New Day"
        };

        char[][] seats = new char[5][5];

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'O';
            }
        }

        System.out.println("Welcome to Movie Booking System!");
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }

        System.out.print("Select a movie (1-" + movies.length + "): ");
        int movieChoice = sc.nextInt();

        if (movieChoice < 1 || movieChoice > movies.length) {
            System.out.println("Invalid movie selection. Exiting...");
            return;
        }

        System.out.println("You selected: " + movies[movieChoice - 1]);

        int choice;
        do {
            System.out.println("\nSeat Layout (O = Available, X = Booked):");
            displaySeats(seats);

            System.out.print("Enter row (1-5): ");
            int row = sc.nextInt() - 1;
            System.out.print("Enter column (1-5): ");
            int col = sc.nextInt() - 1;

            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                if (seats[row][col] == 'O') {
                    seats[row][col] = 'X';
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked. Try another.");
                }
            } else {
                System.out.println("Invalid seat selection.");
            }

            System.out.print("Do you want to book another seat? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Thank you for booking!");
    }
}