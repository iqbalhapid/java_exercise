public class Calculation extends UserInput{
    int tabung1[] = new int[count];
    int tabung2[] = new int[count];
    int i = 0;
    int count = j1 + j2;

    public int initialTabung1(int[] tabung1){
        tabung1[i] = j1;
        return i++;
    }

    public int initialTabung2(int[] tabung2){
        tabung2[i] = j1;
        return i++;
    }

    public int compute(int[] tabung1, int[] tabung2){
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
    }


}