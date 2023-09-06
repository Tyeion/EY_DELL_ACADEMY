package com.pardeep.Tyeion17Aug;

class InvalidAgedException extends Exception
{
	InvalidAgedException(String message){
	super(message); //super use for calling immediate parent object class
	}

}
public class LetsCreateCustomException {

	public static void main(String[] args) {
		try {
		validVoterStatus(17);
		}catch(InvalidAgedException e)
		{
			System.out.println("Exception mesaage is "+ e.getMessage());
		}
		
		System.out.println("Code Will run smoothly after this");
		
	}
	
	static void validVoterStatus(int age) throws InvalidAgedException{
		if(age < 18) {
			throw new InvalidAgedException("User cannot Vote!!");
		}
	}
}
