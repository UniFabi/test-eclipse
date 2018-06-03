
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			try {
				while(true) {
					Thread.sleep(1000);
					System.out.println("Hallo");
					//Test Cmment pls ignore
					//Woop woop

			}catch(Exception e) {
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
