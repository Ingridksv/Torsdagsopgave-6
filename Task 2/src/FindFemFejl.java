public class FindFemFejl {

    public static void main(String[] args) {
        Cinema biogrande = new Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 4)); //5 skal ændres til 4
        // da array altid starter ved 0 og ikke 1. (6)

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows()-1; //vi indsætter -1 for at få den ind i arrayets størrelse (7)
        int numberOfSeats = biogrande.getSeats()-1;
        biogrande.reserve(numberOfRows, numberOfSeats);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 4)); //her skal
        //5 ligeledes ændres til 4, så det bliver true.
    }
}