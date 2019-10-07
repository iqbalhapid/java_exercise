public class Operation extends UserInput {

    public double result;

    public double hasil(double result){
        return (double)result;
    }
    
    public double hitung(String operand, double op1, double op2){
        
        if (operand.equals("+")) {
            return result = op1 + op2;
        } else if(operand.equals("-")) {
            return result = op1 - op2;
        }   else if (operand.equals("*")){
            return result = op1 * op2;
        }    else if (operand.equals("/")){
            return result = op1 / op2;
        } else {
            return result = op1 % op2;
        }


    }
}