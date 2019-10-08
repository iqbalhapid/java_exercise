

public class CalculatorImplementation{
public static void main(String[] args) {

    UserInput UserInputObject = new UserInput();
    Operation Calculate = new Operation();
    DisplayOutput show = new DisplayOutput();
    
    
    System.out.println("masukkan angka pertama :");
    double angka1 = UserInputObject.getNumber();
    System.out.println("masukkan angka kedua :");
    double angka2 = UserInputObject.getNumber();

    try{
    System.out.println("masukkan Operand (+,-,*,/) :");
    String op = UserInputObject.getOperand();
     //cuman return hasil
    double hasil = Calculate.hitung(op,angka1,angka2); //hitung 
    show.displayOut(hasil, angka1, angka2); //display
    }catch (ErrorException e){
    show.messageError(e.getMessage());
    }

    }
}