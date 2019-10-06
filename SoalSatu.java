/**
 * SoalSatu
 */
public class SoalSatu {

    public static void main(String[] args) {
    
    int input[] = {1,25,5,6,15,12};
    int max=0;
    for(int i=0; i<input.length;i++){
        if(input[i]>max){
            max = input[i];
        }
            
    }

    System.out.println(max);

            
    }
}