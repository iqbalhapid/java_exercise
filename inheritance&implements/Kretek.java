import java.util.Scanner;

public class Kretek extends Rokok implements Rasa {
        
        public Kretek(String m, String j, String k ){
        super(m, j, k);
        }

        public String getMerk(){
                System.out.println("merk" + merek);
        }

        public boolean manis(){
        System.out.println("Apakah udud nya manis? :");
        Scanner jawaban = new Scanner(System.in);
        String ya, tidak;    
        if(input.nextLine()=="ya"){
                return jawaban = true;
        }
                return jawaban = false;
        }

        public boolean wangi(){
        System.out.println("Apakah udud nya wangi? :");

        Scanner jawaban = new Scanner(System.in);
        String ya, tidak;    
        if(input.nextLine()=="ya"){
                return jawaban = true;
        }
                return jawaban = false;
        }


        public boolean netral(){
        System.out.println("Apakah udud nya netral? :");
        Scanner jawaban = new Scanner(System.in);
        String ya, tidak;    
        if(input.nextLine()=="ya"){
                return jawaban = true;
        }
                return jawaban = false;
        }
        
        

        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan merek rokok favorit anda :");
        String me = input.nextLine();
        System.out.println("Masukkan jenis rokok anda (kretek/filter) :");
        String je = input.nextLine();
        System.out.println("kategori rokok anda :");
        String ka = input.nextLine();

        Kretek udud = new Kretek (me,je,ka);

        System.out.println("merek rokok anda :" +me);
        System.out.println("jenis rokok anda" +je);
        System.out.println("kategori rokok anda" +ka);


        }

}