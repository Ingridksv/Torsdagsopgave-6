public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];   //har byttet om så dobblet arrayet bliver instaniseret først. (1)
        for ( int i=0; i< rows; i++){           // Sammenligning længere nede. (2)
            for (int j =0; j<seats; j++ ){
                this.seats[i][j]= "0";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is 0.       har ændret den til 0 tæller tekst med som fejl?
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("0")) { //sammenligner med fejl 2,skal være 0 og ikke O da den ikke er instantieret (2)
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { //x skal være skrevet med stort X (3)
            seats[row][seat] = "0"; //Skal være 0 og ikke O (4)
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // Her skal vi have et tomt streng og ikke null, så den passer (5)
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}