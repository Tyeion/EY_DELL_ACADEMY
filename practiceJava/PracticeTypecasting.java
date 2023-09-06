package practiceJava;

class Machine{
	void start()
	{
		System.out.println("Started");
	}
	
	void stop()
	{
		System.out.println("Stopped");
	}
}

class Camera extends Machine{
	@Override
	void start() {
		System.out.println("Camera Start");
	}
	
	void snap()
	{
		System.out.println("Clicked");
	}
}



public class PracticeTypecasting {
   
    public static void main(String[] args) {
		Machine m=new Machine();
		Camera c=new Camera();
		Machine kl=new Camera();
		
		m.start(); // started
        m.stop();  //stopped
        c.snap();  //Clicked
        c.start();  //Camera Start
        kl.start(); //Camera Start
        kl.stop();	//Machine Stop
	}
	
}
