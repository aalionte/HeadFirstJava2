//The problem is that the class is missing.
// -- error : class, interface, or enum expected

//Correct the error
public class Exercise1B{
	public static void main(String[] args){
		int x = 5;
		while (x > 1){
			x = x - 1 ;
			if (x < 3){
				System.out.println("small x");
			}
		}
	}
}