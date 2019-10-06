/**
 * SoalEnam
 */
public class SoalEnam {

    static void count(int[] input) {
        int jumlah =0 ;
        for(int i=0; i<=input.length; i++){
            jumlah += i;
        }
        System.out.println("jumlah elemen :" +input.length);
        System.out.print("total sum :" +jumlah);
        }
    
    
        public static void main(String[] args) {
            int input[] = {7,3,8,10,2,4,1,6,9,11};
            
            count(input);
        }
}