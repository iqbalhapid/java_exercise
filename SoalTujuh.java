/**
 * SoalTujuh
 */


public class SoalTujuh {

    public static void main(String[] args) {
        int gelasA = 3;
        //System.out.print("       "+"|------| \n" +"       "+"(******) \n"+"    "+" (***********) \n "+" "+ "(****************) \n ");
        int gelasB = 5;
        //System.out.print("       "+"|------| \n" +"       "+"(******) \n"+"    "+" (***********) \n "+" "+ "(****************) \n "+"(*****************) \n "+"(******************) \n ");


        int hasil = gelasB - gelasA;
        hasil = gelasA-hasil;

        System.out.println(hasil+ " Liter");
        
    
    
        

    }
}


// public static void main(String[] args)
//     {
//         // Create a new Scanner object
//         Scanner scanner = new Scanner(System.in);

//         // Get the number of rows from the user
//         System.out.println("Enter the number of rows needed to print the pattern ");

//         int rows = scanner.nextInt();
//         System.out.println("## Printing the pattern ##");
        
//         // Print i number of stars
//         for (int i=1; i<=rows; i++)
//         {
//             for (int j=1; j<=rows; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }