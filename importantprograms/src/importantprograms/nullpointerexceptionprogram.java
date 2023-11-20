package importantprograms;

public class nullpointerexceptionprogram {
	
	public static void main(String[]args) {
		
		
		String str=null;
		
		System.out.println(str);
		
		try {
			int length=str.length();
			
			
		}
		catch(NullPointerException e) {
			
			System.out.println("NullPointerExceptionoccured:"+e.getMessage());
			
			
		}
		
		
	}

}
