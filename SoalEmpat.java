public class SoalEmpat {

    static void bubbleSort(int[] input) {  
        int n = input.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(input[j-1] > input[j]){  
                                 //swap elements  
                                temp = input[j-1];  
                                input[j-1] = input[j];  
                                input[j] = temp;  
                        }  
                
                }  
        }  

    }  

    public static void main(String[] args) {
    
    int input[] = {7,3,8,10,2,4,1,6,9};
    
    bubbleSort(input);//sorting array elements using bubble sort  
                
                
                for(int i=0; i < input.length; i++){  
                        System.out.print(input[i] + " ");  
                }  
    

            
    }
}