
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		System.out.println("Enter a number to continue..");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		System.out.println("start of main......");
		Runnable simple = ()-> 	  {
						System.out.println("in run of Simple");
						try { 			Thread.sleep(3000); 		} catch (InterruptedException e) { 	e.printStackTrace(); 			}
				};
		Thread t1 = new Thread(simple);
		t1.start();
		System.out.println("end of main......");
		
	}

}
