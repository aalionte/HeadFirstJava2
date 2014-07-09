class Area{

	int calcArea(int height, int width){
		return height * width;
	}
}

class AreaTest{
	
	public static void main(String[] args){
		Area area = new Area();
		int a = area.calcArea(7, 12);
		short c = 7;
		area.calcArea(c, 15);
		//int d = area.calcArea(57); // not working because of the list of parameters
		area.calcArea(2,3);
		long t = 42; 
		//int f = area.calcArea(t, 17); // long cannot be converted to int implicitly
		//int g = area.calcArea(); // won't work without params
		byte h = area.calcArea(4,20);
		
	}
}
	
