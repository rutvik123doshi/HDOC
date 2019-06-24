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
        
        # Remove Trivial Condtions
        if (r==0 ){
            System.out.println("1.000000");
            return;
        }

        float previous = 1, current, sum=0;
        while(true){
            // Make sure red wins
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

        } 
        System.out.printf("%.6f\n",sum);
                
    }
    
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()) ;
        
        for(int p=0; p<t; p++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) ;
            int b = Integer.parseInt(st.nextToken()) ;
            solve(a, b);
        }
    }
}
