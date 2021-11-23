package old;

import java.util.Scanner;

class Simple implements Runnable 
{
	@Override
	public void run() {
			System.out.println("in run of Simple");
			try { 			Thread.sleep(3000); 			} catch (InterruptedException e) { 				e.printStackTrace(); 			}
	}
}

public class Lab3 {

	public static void main(String[] args) {
		System.out.println("Enter a number to continue..");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
	
		System.out.println("start of main......");
		Thread t1 = new Thread(new Simple());
		t1.start();
		System.out.println("end of main......");
		
	}

}
