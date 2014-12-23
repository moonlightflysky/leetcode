package newproblems;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
	
	public int lengthOfLongestSubstringTwoDistinct(String s){
		
		if (s == null || s.length() <= 1){
			return 0;
		}
		
		int N = s.length();
		
		int i = 0, j = -1;
		int globalMax = 0;
		
		for (int k = 1; k < N; k++){
			
			if (s.charAt(k) == s.charAt(k - 1)){
				continue;
			}
			
			else if (j >= 0 && s.charAt(k) != s.charAt(j)){
				int curMax = k - i;
				globalMax = Math.max(curMax, globalMax);
				i = j + 1;
			}
			
			j = k - 1;
			
		}
		
		return globalMax;
	}

}
