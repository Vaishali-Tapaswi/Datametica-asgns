import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Lab5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i =0; i< 30;i++){
			list.add(" str " + i);
			}
	/*	Consumer<String> c1 = (x)->System.out.println(x);
		list.forEach(c1);
	*/

//		list.forEach(x->System.out.println(x));
		list.forEach(System.out:println);
		
		/*	for (int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		}*/
	}

}
