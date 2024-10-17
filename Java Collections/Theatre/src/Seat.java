public class Seat implements Comparable<Seat> {
    private char row;
    private int number;
    private boolean reserved;
    private String seatId;

    public Seat(char row, int number) {
        this.row = row;
        this.number = number;
        this.reserved = false;
        this.seatId = row + "" + (number > 10 ? number > 100 ? number : "0" + number : "00" + number);
    }

    public char getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getSeatId() {
        return seatId;
    }

    @Override
    public String toString() {
        return "The seat " + seatId +
                ", is=" + (reserved ? "" : "not ")
                + "reserved";
    }

    @Override
    public int compareTo(Seat o) {
        int rowComparer = Character.compare(this.row, o.row);
        if (rowComparer != 0) {
            return rowComparer;
        }
        return Integer.compare(this.number, o.number);
    }
}