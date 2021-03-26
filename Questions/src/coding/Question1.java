package coding;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("100");
		list.add("200");
		list.add("300");
		list.add("400");
		list.add("500");
		System.out.println(list);

		list.remove("400");
		list.remove("500");
		System.out.println(list);
		

	}

}
