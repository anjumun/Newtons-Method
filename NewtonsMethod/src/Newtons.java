
public class Newtons {
	public static void main(String[] args){
		double x = 1;//our guess	
		
		System.out.printf("%4s%12s\n","step","x");
		System.out.printf("----  -----------\n");
		for(int i=0;i<10;i++){			
			x= x - (f(x)/fprime(x));			
			System.out.printf("%03d   %12.10f\n",i,x);						
		}
	}
	//method to evaluate our function 
	public static double f(double x){
		 x = Math.pow(x, 2) -2;
		return x;
	}
	// evaluate f1 at x
	public static double fprime(double x){
		x = 2*x;
		return x;
	}
}
