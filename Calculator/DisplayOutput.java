public class DisplayOutput{
    

    public void displayOut(double result, double angka1, double angka2){
        System.out.println("hasil perhitungan angka " +angka1+ " dengan " +angka2+ " adalah " +result);
    }

    public String messageError(){
        return "the number you type its not valid (must a number)";
    }
}