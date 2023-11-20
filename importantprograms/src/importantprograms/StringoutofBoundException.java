package importantprograms;

public class StringoutofBoundException {
	
	public static void main(String[]args) {
		
		
		String str="Hello";
		
		try {
			
			char charcter =str.charAt(10);
			
		}	catch(StringIndexOutOfBoundsException e) {
				
			
			System.out.println("StringIndexOutofBoundsExcpetion occured:"+e.getMessage());
				
			}
		}
		
	}


