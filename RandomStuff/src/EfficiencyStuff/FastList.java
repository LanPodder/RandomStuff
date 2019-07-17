package EfficiencyStuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class FastList<T> extends ArrayList<T>{
	
	public static void main(String[] args) {
		FastList<String> list = new FastList<>();
		ArrayList<String> comparelist = new FastList<>();
		long startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list.add("yeetboi" + i);
			comparelist.add("yeetboi" + i);
		}
		list.add("yeetboi");
		System.out.println((System.nanoTime() - startTime) / 1000000 + " : milliseconds elapsed, lists filled");
		
		System.out.println(list.retainAll(comparelist));
		
		System.out.println((System.nanoTime() - startTime) / 1000000 + " : milliseconds elapsed, Lists compared");
	}
	
	public FastList() {
		super();
	}
	
	public boolean containsAll(Collection<?> collection) {
		HashSet<T> set = new HashSet<>(this);
		for (Object t : collection) {
			if(!set.contains(t)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		Objects.requireNonNull(c);
		HashSet<?> set = new HashSet<>(c);
        boolean modified = false;
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
	}
}
