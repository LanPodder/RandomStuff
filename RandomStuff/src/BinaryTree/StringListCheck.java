package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringListCheck {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String n;
		while (!(n = scann.nextLine()).equals("x")) {
			List<String> li = new ArrayList<>();
			li.add("abc");
			li.add("def");
			li.add("ghi");
			li.add("jkl");
			int list_size = li.size();
	        for (int i = 0; i < list_size; i++) {
	            if (n.equals(li.get(i))) {
	                System.out.println("client table update");
	                   if(i <list_size){
	                      continue;
	                    }
	            } else {
	                System.out.println("category and client table update");
	            }
	        }
		}
	}
}
