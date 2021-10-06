
public class HelloWorld {
	public static void main(String[] args) {
		
		int[] zahlen = {1,2,3,4,5,6,7,8,9} ; 	
		
		System.out.println("hallo World");
		
		for( int element : zahlen ){
			System.out.println( "Dies war in dem Array: " + element );
		}

	}
}