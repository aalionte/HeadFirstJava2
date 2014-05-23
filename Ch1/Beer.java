public class Beer{
	public static void main(String args[]){
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0){
			if( beerNum == 1){
				word = "bottle";
			}
			System.out.print( beerNum + " " + word + " of beer on the wall, ");
			System.out.println( beerNum + " " + word + " of beer.");
			beerNum--;
			if( beerNum == 0){
				System.out.println("Take one down and pass it around,  no more bottles of beer on the wall");
			}
			else{
				System.out.println("Take one down and pass it around, " + beerNum + " " + "of beer on the wall");
			}
	}
	if( beerNum == 0){
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		beerNum = 99;
		System.out.println("Go to the store and buy some more, " +  beerNum +" bottles of beer on the wall.");
		}
	}
}