public class Calculate {
    public static void main(String[] args) {
    int input[] = {1,2,3,4,5,6,7,8,9,10,11};


            int left[] = new int[input.length/2];
            for(int i=0; i<left.length; i++){
                left[i] = input[i];
                System.out.println(left[i]);
            }

            int right[] = new int[(input.length)/2];
            int temp =(input.length/2)-1 ;
            for(int j=0; j<input.length/2; j++ ){
                temp++;
                right[j] = input[temp];
                System.out.println(right[j]);
            }
        }
        }
    

        
    
    
