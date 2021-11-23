
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		System.out.println("Enter a number to continue..");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		System.out.println("This is a start of main...");
		Runnable verysimple = ()-> 	  {
						System.out.println("in run of Very Simple");
						try { 			Thread.sleep(300); 		} catch (InterruptedException e) { 	e.printStackTrace(); 			}
				};
		Thread t1 = new Thread(verysimple);
		t1.start();
		System.out.println("end of main......");
		
	}

}
