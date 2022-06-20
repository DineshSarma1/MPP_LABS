package lab8.problem4;


import java.util.Arrays;
import java.util.List;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem4 filter = new Problem4();
		List<String> list = Arrays.asList("john","mary","oaks","thomas","kevin");
		System.out.println(filter.countWords(list, 'o', 'y', 4)); 
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		  return (int)words.stream()
  	     .filter(word -> contains(word, c) && !contains(word, d) && word.length() == len) //returns filtered stream
  	     .count();
	}
	
	public boolean contains(String word, char c) {
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == c)
				return true;
		}
		return false;
	}

}