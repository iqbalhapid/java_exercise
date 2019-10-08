public class DisplayOutput{
    

    public void displayOut(double result, double angka1, double angka2){
        System.out.println("hasil perhitungan angka " +angka1+ " dengan " +angka2+ " adalah " +result);
    }

    public void messageError(String e){
        System.err.println("Catch an error (Invalid input Type of Operand)");
    }
}