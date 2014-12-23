package newproblems;

import java.util.ArrayList;

public class MissingRanges {
	
	public ArrayList<String> findMissingRanges(int[] num, int start, int end){
		
		ArrayList<String> res = new ArrayList<String>();
		if (num == null){
			return res;
		}
		
		int pre = start - 1;
		int N = num.length;
		
		for (int i = 0; i <= N; i++){
			int cur = 0;
			if (i == N){
				cur = end;
			}
			
			else{
				cur = num[i];
			}
			
			if (cur - pre >= 2){
				String item = getString(pre + 1, cur - 1);
				res.add(item);
			}
			
			pre = num[i];
		}
		
		return res;
		
	}
	
	private String getString(int a, int b){
		
		if (a == b){
			return String.valueOf(a);
		}
		
		else{
			return a + " => " + b;
		}
	}

}
