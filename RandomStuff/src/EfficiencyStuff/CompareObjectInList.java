package EfficiencyStuff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareObjectInList {
	public static void main(String[] args) {
		ArrayList<ThatObject> A = new ArrayList<>();
		//ArrayList<ThatObject> B = new ArrayList<>();
		HashMap<Integer, ThatObject> map = new HashMap<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			ThatObject t = new ThatObject(i, "yeet " + i);
			A.add(t);
			// B.add(t);
			map.put(t.hashCode(), t);
		}
		System.out.println((System.nanoTime() - startTime) / 1000000 + " : milliseconds elapsed, ArrayList filled");

		// justCompareAbout1Minute(A, B); //slow af

		// justCompareHashSet(A, new HashSet<>(B)); //this is stupid fast
		justCompareHashMap(A, map); // this is stupid fast aswell

		System.out.println((System.nanoTime() - startTime) / 1000000 + " : milliseconds elapsed, ArrayLists compared");
	}

	private static void justCompareHashMap(ArrayList<ThatObject> a, HashMap<Integer, ThatObject> map) {
		for (int i = 0; i < a.size(); i++) {
			ThatObject o = a.get(i);
			if (map.get(o.hashCode()) != null) {
				o.doSomething();
			}
		}
	}

	public static void compareAndDoSomething2Minutes(ArrayList<ThatObject> A, ArrayList<ThatObject> B) {
		// takes about 2 minutes
		for (int i = 0; i < A.size(); i++) {
			if (B.contains(A.get(i))) {
				B.get(B.indexOf(A.get(i))).doSomething();
			}
		}
	}

	// O(n^2)
	public static void justCompareAbout1Minute(ArrayList<ThatObject> A, ArrayList<ThatObject> B) {
		// takes about a minute
		for (int i = 0; i < A.size(); i++) {
			ThatObject o = A.get(i);
			if (B.contains(o)) {
				System.out.println(i);
			}
		}
	}

	// O(n)
	private static void justCompareHashSet(HashSet<ThatObject> B) {
		// about 60 millisecs
		for (int i = 0; i < B.size(); i++) {
			if (B.contains(new ThatObject(i, "yeet " + i))) {

			}
		}
	}

	private static void justCompareHashMap(HashMap<Integer, ThatObject> map) {
		for (int i = 0; i < map.size(); i++) {
			ThatObject o = new ThatObject(i, "yeet " + i);
			if (map.get(o.hashCode()) != null) {
				o.doSomething();
			}
			
		}
	}

	public static void secondAttempt() {
		ArrayList<ThatObject> A = new ArrayList<>();
		HashSet<ThatObject> B = new HashSet<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ThatObject t = new ThatObject(i, "hello " + i);
			A.add(t);
			B.add(t);
		}
	}
}
