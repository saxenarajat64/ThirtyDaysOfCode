import java.util.*;
import java.io.*;

public class Day17 {
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator{
	int power(int n, int p) throws Exception{
		
		if(n<0 || p<0){
			exceptionFunction();
			return 0;
		}else{
			return (int) Math.pow(n, p);
		}
		
	}

	private void exceptionFunction() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("n and p should be non-negative");
		
	}
}
