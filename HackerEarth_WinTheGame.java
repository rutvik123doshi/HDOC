/* IMPORTANT: Multiple classes and nested static classes are supported */

//uncomment this if you want to read input.
// imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    
    public static void solve(int r, int b){
        // dp wala solution
        // float prods[] = new float[r];
        if (r==0 ){
            System.out.println("1.000000");
            return;
        }
        float sum = ((float)r/ (r+b));
        float previous = 1;
        float current ;
        // r--;
        sum=0;
        // if (sum < 1 && sum>0){

        //   for(int i =0; i<r; i++){
           while(true){
            // if(b==0){
            //     // do something
            //     break;
            // }
            
            // red ko jitao
            if(previous==0){
                break;
            }
            
            current = previous * ((float) (r)/ (r+b));
            sum += current;
            // check for exit cases;

            

            if(b<2){
                break;
            }
            previous *=  ((float) b/ (r+b)) ;
            b--;
            previous *=  ((float) b/ (r+b)) ;
            b--;
            
            
            
            // current = previous* ((float) b/ (r+b));
            // if(r==0){
            //     break;
            // }
            // b--;
            // current *=  ((float) (r)/ (r+b));
            // r--;
            // sum += current ;
        
            // break when prods[i] is 0
            
            } 
        // }
        System.out.printf("%.6f\n",sum);
        
        
    }
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()) ;
        
        for(int p=0; p<t; p++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) ;
            int b = Integer.parseInt(st.nextToken()) ;
            solve(a, b);
        }
        // Write your code here

    }
}
