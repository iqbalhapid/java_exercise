import java.util.*;
class Tabung{
    public static void main(String sap[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("\nmasukkan kapasitas tabung 1: ");
    int j1 = sc.nextInt(); //3

    
    System.out.print("\nmasukkan kapasitas tabung 2: ");
    int j2 = sc.nextInt(); //5

    //handle jumlah iterasi dan inisialisasi max element tabung
    int count = j1 + j2; 

    //inisialisi array kosong representasi tabung dan limitasi memory
    int tabung1[] = new int[count];
    int tabung2[] = new int[count];

    int i=0;

    //inisialisasi volum tabung 1 dan 2
    tabung1[i] = j1; //indeks ke 0 
    //System.out.println(tabung1[i]); //3
    tabung2[i] = 0; //indeks ke 0
    //System.out.println(tabung2[i]); //0
    i++; //0, nilai i jadi 1

    // System.out.println(tabung1[i-1]); //3
    // System.out.println(tabung2[i-1]); //0
    
    tabung1[i] = 0; 
    // System.out.println(tabung1[i]); //0
    tabung2[i] = j1; 
    // System.out.println(tabung2[i]); //3
    i++; //0

    System.out.println(tabung1[i-1]); //0
    System.out.println(tabung2[i-1]); //3


    



        while(i < count){
            if(tabung1[i-1] > 0){ //cek tabung 1 kosong apa terisi
                tabung1[i] = tabung1[i-1]; //3 //tabung 3 diisi
                tabung2[i] = 0; //0
            }
            else{
                tabung1[i] = j1; //3
                tabung2[i] = tabung2[i-1]; //3
            }
            i++;
            

            if(tabung2[i-1] > 0){ //cek tabung 2 //3
                if(tabung1[i-1] + tabung2[i-1] < j2){ //tabung 2 belum penuh 
                        tabung2[i] = tabung1[i-1] + tabung2[i-1]; //tabung1 dituang ke tabung 2
                        tabung1[i] = 0; //tabung 1 dibuang
                }
                else{
                        int temp = tabung2[i-1];
                        temp = j2 - temp; //sisa tabung 2
                        tabung2[i] = temp + tabung2[i-1]; //3+2
    
                        tabung1[i] = tabung1[i-1] - temp; //sisa tabung 1
                }
            }
            else{
                tabung2[i] = tabung1[i-1]; //3
                tabung1[i] = 0; 
            }
            i++;
        }

    //hasil akhir
        for(i=0; i<count; i++){
                System.out.print("\ntabung1: "+tabung1[i]+"\ttabung2: "+tabung2[i]);
        }

    System.out.println();
    }
}
