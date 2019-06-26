package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareObject implements Comparable<CompareObject>{
	public static void main(String[] args) {
		List<CompareObject> list = new ArrayList<>();
		list.add(new CompareObject("1", "1"));
		list.add(new CompareObject("2", "2"));
		list.add(new CompareObject("3", "3"));
		list.add(new CompareObject("4", "12"));
		list.add(new CompareObject("5", "1d3"));
		
		Collections.sort(list, Collections.reverseOrder()); //Collections.reverseOrder() meaning in descending order here
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).id + " - " + list.get(i).myNumber);
		}
	}
	
	String id;
	String myNumber;
	
	public CompareObject(String id, String myNumber) {
		this.id = id;
		this.myNumber = myNumber;
	}
	
	public int compareTo(CompareObject c) {
		String myNumberOnlyNumbers = "";
		String otherNumberOnlyNumbers = "";
		for(int i = 0; i < myNumber.length(); i++) {
			try {
				myNumberOnlyNumbers += Integer.parseInt(myNumber.charAt(i)+"") + "";
			} catch (NumberFormatException e) {
				
			}
		}
		
		for(int i = 0; i < c.myNumber.length(); i++) {
			try {
				otherNumberOnlyNumbers += Integer.parseInt(c.myNumber.charAt(i)+"") + "";
			} catch (NumberFormatException e) {
				
			}
		}
		
		return Integer.compare(Integer.parseInt(myNumberOnlyNumbers), Integer.parseInt(otherNumberOnlyNumbers));
	}
}
