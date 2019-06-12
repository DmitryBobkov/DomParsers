package by.academy.myDomProject.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * Class Utils
 *
 */

public class Utils {
	public void findMaxMin(Set<String> set) {
		List<String> list = new ArrayList<String>(set);

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length()) {
					return 1;
				} else if (o1.length() > o2.length()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println("max = " + (list.get(0)));
		System.out.println("min = " + (list.get(list.size() - 1)));
	}

}
