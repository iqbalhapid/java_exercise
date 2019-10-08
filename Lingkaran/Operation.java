public class Operation extends UserInput{
    public double result;
    private double phi = Math.PI;

    public double hasil(double result){
        return (double)result;
    }
    
    public double hitung(String operand, double r){
        
        if (operand.equals("luas")) {
            return result = phi * r * r ;
        } else if(operand.equals("keliling")) {
            return result = 2 * phi * r;
        }   else {
            return phi;
            

    }
}

}