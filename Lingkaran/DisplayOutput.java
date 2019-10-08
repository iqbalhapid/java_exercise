public class DisplayOutput{
    
    public void displayOut(double result, String operand, double r){
        System.out.println("hasil perhitungan " +operand+ " dengan jari-jari sebesar " +r+ "  adalah " +result);
    }

    public void messageError(String e){
        System.err.println("Catch an error (Invalid input Type of Operand) retrying..");
    }
}