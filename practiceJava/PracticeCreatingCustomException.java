package practiceJava;


class InvalidAgeException extends Exception{
	InvalidAgeException(String str)
	{
		super(str);
	}
}

public class PracticeCreatingCustomException {
		public static void main(String[] args) {
			try {
				validPerson(19);
				
			}catch(InvalidAgeException e) {
				System.out.println("The exception message is"+ e.getMessage());
			}
			
			System.out.println("The code running is smooth");
		}
		
		
		static void validPerson(int age) throws InvalidAgeException
		{
			if(age<18)
			System.out.println("You are not allowed to vote!!");
			
		}
}
