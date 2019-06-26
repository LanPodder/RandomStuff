package BinaryTree;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CurrentTime extends Thread {

	public void run() {
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i <= 10; i++)
			try {
				Thread.sleep(2000);
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				System.out.println(sdf.format(cal.getTime()));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void main(String[] args) {
		int[] array = {2,2,3,4,5};
		int sum = getSum(array); //sum of values from array. i'll leave that to you
		System.out.println(sum);
		int len = array.length;
		for(int i = len; i >= 1; i--){
		    String[] digits = (""+((double)sum/(double)i)).split("[.]");
		    if(digits[1] != null){
		        if(Integer.parseInt(digits[1]) > 0){

		        }else{
		            len = i;
		            break;
		        }
		    }
		}
		int equalnums = sum/len;
		for(int i = 0; i < len; i++){
		    array[i] = equalnums;
		}
		
		for(int i = len; i < array.length; i++) {
			array[i] = 0;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static int getSum(int[] array) {
		int s = 0;
		for(int i = 0; i < array.length; i++) {
			s += array[i];
		}
		return s;
	}

	public static int countVowels(String[] ar1) { // this method counts

		int vowelPerWord = 0;
		int totalWordsWithThreeVowels = 0;
		char[] ar2 = new char[] { 'a', 'e', 'i', 'u', 'y', 'o' };
		for (int i = 0; i < ar1.length; i++) {
			vowelPerWord = 0;
			for (int j = 0; j < ar1[i].length(); j++) {
				for (int k = 0; k < ar2.length; k++) {
					if (ar2[k] == (ar1[i].charAt(j))) {
						vowelPerWord++;
					}
				}
			}
			if (vowelPerWord >= 3) {
				totalWordsWithThreeVowels++;
			}
		}
		return totalWordsWithThreeVowels;
	}

	public static String normalize(String string) {

		if (string.length() < 1) {
			return "";
		}
		StringBuilder text = new StringBuilder(string.trim());

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				removeWhiteSpaces(i + 1, text);
			}
		}

		if (text.charAt(text.length() - 1) != '.') {
			text.append('.');
		}

		text.append("\n");
		return text.toString();
	}

	public static void removeWhiteSpaces(int index, StringBuilder text) {
		int j = index;
		while (text.charAt(j) == ' ') {
			text.deleteCharAt(j);
		}
	}
}
