
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    private String name;
    private int seatsInARow;
    private Set<Seat> seats;
    private int rows;

    public Theatre(String name, int rows, int totalSeats) {
        this.name = name;
        this.seatsInARow = totalSeats / rows;
        this.seats = generateOrderedSeats(seatsInARow, rows);
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsInARow() {
        return seatsInARow;
    }

    public void setSeatsInARow(int seatsInARow) {
        this.seatsInARow = seatsInARow;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    private Set<Seat> generateOrderedSeats(int seatsInARow, int rows) {
        Set<Seat> generatedSeats = new TreeSet<Seat>();
        for (int alphabetIndex = 65; alphabetIndex <= 65 + rows; alphabetIndex++) {
            for (int i = 1; i < seatsInARow; i++) {
                generatedSeats.add(new Seat((char) alphabetIndex, i));
            }
        }
        return generatedSeats;
    }

    public void printTheatreMap() {
        System.out.println(" ".repeat(4) + "-".repeat(20));
        System.out.print(" ".repeat(4));
        System.out.printf("%s\n", this.name);
        System.out.println(" ".repeat(4) + "-".repeat(20));
        System.out.print("     ");
        for (int i = 1; i <= this.seatsInARow; i++) {
            System.out.printf("%-3d ", i);
        }
        System.out.println();
        for (char row = 'A'; row < 'A' + this.rows; row++) {
            System.out.print(" " + row + " |");
            for (int seatNumber = 1; seatNumber <= this.seatsInARow; seatNumber++) {
                Seat seat = new Seat(row, seatNumber);
                boolean isReserved = this.seats.contains(seat) && seat.isReserved();
                System.out.print(" " + (isReserved ? "X" : "O") + " |");
            }
            System.out.println();
            System.out.print("   +");
            for (int i = 0; i < this.seatsInARow; i++) {
                System.out.print("---+");
            }
            System.out.println();
        }
    }
}
