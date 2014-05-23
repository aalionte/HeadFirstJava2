class Exercise1A{
	public static void main(String [] args){
		int x = 1;
		//infinite loop. To avoid it, an operation inside the while is recommended. Or change while into a if.
		while (x < 10) {
			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}