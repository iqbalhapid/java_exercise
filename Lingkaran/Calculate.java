public class Calculate{
    public static void main(String[] args) {
        
    UserInput UserInputObject = new UserInput();
    Operation calc = new Operation();
    DisplayOutput show = new DisplayOutput();
    
    
    
    System.out.println("masukkan besar jari -jari :");
    double angka1 = UserInputObject.getNumber();
    boolean success = false; //handle iteration
    while (!success) {
        try{
        System.out.println("masukkan jenis perhitungan (ketik : luas atau keliling) :");
        String op = UserInputObject.getOperand();
        double hasil = calc.hitung(op,angka1); //hitung 
        show.displayOut(hasil,op,angka1); //cuman return hasil
        success = true; //break out of the loop
        }catch (ErrorException e){
        show.messageError(e.getMessage());
        }

        }
    }
}
