package practiceJava;

public class PracticeTryWithResourceWithAutoCloseable {

	static class MyResource implements AutoCloseable{
		@Override
		public void close() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Close Will be called automatically for cleanup activity");
		}
	}

	public static void main(String[] args) {
		
		try {
			tryWithResource();

		}catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
		
		try {
			tryWithOutResource();
		}catch(Exception e)
		{
			System.out.println("Exception is"+ e.getMessage());
		}
	}
	
	static void tryWithResource() throws Exception
	{
		try(MyResource m=new MyResource())
		{
		
			System.out.println("I am inside resourcemethod");
			if(true)
			{
				throw new Exception("This exception belongs to tryWithResource method");
			}
		}
	}
	//try can be used without cathc and finally but with resource method
	//tryWithOutResource method is traditional 
	static void tryWithOutResource() throws Exception
	{
		MyResource m=null;
		try
		{
		    m=new MyResource();
			System.out.println("I am inside tryWithOutresourcemethod");
			if(true)
			{
				throw new Exception("This exception belongs to tryWithOutResource method");
			}
		}finally {
			if(m!=null)
			{
				m.close();
			}
		}
	}
}
