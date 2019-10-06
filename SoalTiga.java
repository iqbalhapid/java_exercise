import java.util.Scanner;

public class SoalTiga {

    public static void main(String[] args) {
        int input[]={1,2,3,4,5,6,7,8,9,10};
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = Integer.parseInt(myObj.nextLine()); 

        for (int i=0; i<n*2; i++){
            if (input[i]%2!=0){
                System.out.print(input[i]);
            }   
            
        }
        
        
        
    }
}