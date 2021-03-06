package oldExam.prob5;

import java.util.*;

public class AllPairs {
	public static List<Pair<Integer, Integer>> allIncreasingPairs(List<Integer> list) {
		List<Pair<Integer, Integer>> returnVal = new ArrayList<>();
		for(int x: list) {
			for(int y: list) {
				if(x < y ) {
					Pair<Integer, Integer> p = new Pair<>(x,y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}

	// should work for string, Employees, LocalDates

	public static <T> List<Pair<T,T>> allIncreaseingPairs2(List<? extends T> list, Comparator<? super T> compare){
		List<Pair<T,T>> returnVal = new ArrayList<>();
		for(T x : list) {
			for(T y : list) {
				if(compare.compare(x, y) != 0 && compare.compare(x, y) < 1) {
					Pair<T,T> p = new Pair<>(x,y);
					returnVal.add(p);
				}
			}
		}
		
		return returnVal;
	}

	}
