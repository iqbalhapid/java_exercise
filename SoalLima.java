/**
 * SoalLima
 */
public class SoalLima {

    static void divide(int[] input) {
    int n = input.length;
    int g=0;
    
    if (n%2!=0){
        g = (n+1)/2;
        System.out.print(input[g]);
    }else{
        g = n/2;
        System.out.print(input[g] +" "+ input[g+1]);
    }


    }


    public static void main(String[] args) {
        int input[] = {7,3,8,10,2,4,1,6,9,11};
        
        divide(input);
    }
}