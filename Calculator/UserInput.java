import java.util.Scanner;

public class UserInput{
    
    public int op1;
    public int op2;
    public String operand;

    public int getNumber(){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        return s;
        
    }
    

    
    public String getOperand() throws ErrorException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") ) {
            return s;
        } else {
            throw new ErrorException();   
        }
    }
}