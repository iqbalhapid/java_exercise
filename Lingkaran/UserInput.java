import java.util.Scanner;

public class UserInput{
    public double r;
    public String operand;

    public int getNumber(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        return s;
        
    }
    
    public String getOperand() throws ErrorException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("luas") || s.equals("keliling") ) {
            return s;
        } else {
            throw new ErrorException();   
        }
    }
}