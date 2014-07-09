public class Foo{
	static int x;
	
	public void go(){
		System.out.println(x);
	}
	
	public static void main(String[] args){
		Foo f = new Foo();
		f.go();
	}
}