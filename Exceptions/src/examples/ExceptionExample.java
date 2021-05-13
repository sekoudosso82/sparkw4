package examples;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		try {
			System.out.println( " 1 / 0 " + (1/0) );
		}catch(ArithmeticException e) {
			System.out.println(" Caught an arithmetic exception!");
			// print the stack programmatically
			e.printStackTrace();
		}finally {
			System.out.println("This is the optional \"finally\" block. it alway execute even with a return in try block");
		}
		System.out.println("The code has continued on, as normal!");
		
	}

}
