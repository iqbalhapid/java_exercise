public class Operation {
    
    public static void main(String[] args) {

    UserInput input = new UserInput();
    Calculation count = new Calculation();
    DisplayOutput show = new DisplayOutput();

    System.out.println("masukkan kapasitas tabung pertama :");
    int capacity1 = Input.getCapacity1();
    System.out.println("masukkan kapasitas tabung kedua :");
    int capacity2 = Input.getCapacity2();

    int init1[] = new int[count.initialTabung1(capacity1)];
    int init2[] = new int[count.initialTabung2(capacity2)]; 
    
    int hasil = count.compute(init1[], init2[]);

    show.displayResult(hasil);
    
}
    
}