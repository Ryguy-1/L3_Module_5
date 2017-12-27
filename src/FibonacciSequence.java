import java.util.ArrayList;

public class FibonacciSequence {
public static void main(String[] args) {
	int x = 1;
	int y = 1;
	int z = 0;
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(x);
	list.add(y);
	for(int i = 0; i<10;i++){
		z = x+y;
		list.add(z);
		x = z+y;
		list.add(x);
		y = z+x;
		list.add(y);
		
	}
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
}
}
