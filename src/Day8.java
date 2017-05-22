import java.io.*;
import java.util.*;

public class Day8 {
	
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String,Integer> diary = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			diary.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if(diary.containsKey(s)){
				System.out.println(s + "=" + diary.get(s));
			}else{
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
