
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			try {
				while(true) {
					Thread.sleep(1000);
					System.out.println("Hallo");
					//Test Cmment pls ignore
<<<<<<< HEAD
=======
					//Second Test comment
>>>>>>> 4c8714519e1415ea9250231653d0aa5d67ae514e
				}
			}catch(Exception e) {
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
