

public class UserInput{
    
    public int op1;
    public int op2;
    public String operand;

    public int getNumber() throws ErrorException{
        if (Integer.valueOf(System.console().readLine()) instanceof Integer){
            return Integer.valueOf(System.console().readLine());
        }else{
            throw new ErrorException();
        }
        
    }
    

    
    public String getOperand(){
        return System.console().readLine();
    }
}