import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2{
	public static void main(String args[]) throws Exception { 
		System.out.println("Enter a number to continue...!!!!");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		
		System.out.println("For loop initiated");
		for(int i =0; i< 30000;i++){
			List<String> list = new ArrayList<>();
			for(int j =0; j< 30000;j++){
				list.add("str" + j);
			}
			Thread.sleep(100);
		}
	
	}
}
