package newproblems;

public class OneEditDistance {
	
	public boolean oneEditDistance(String a, String b){
		
		if (a == null || b == null){
			return false;
		}
		
		int M = a.length();
		int N = b.length();
		
		if (M - N > 0){
			return oneEditDistance(b, a);
		}
		
		if (N - M > 1){
			return false;
		}
		
		int shift = N - M;
		
		int i = 0;
		
		while (i < M && a.charAt(i) == b.charAt(i)){
			i++;
		}
		
		if (i == M && shift == 0){
			return false;
		}
		
		if (i < M){
			if (shift == 0){
				i++;
			}
		}
		
		while (i < M && a.charAt(i) == b.charAt(i + shift)){
			i++;
		}
		
		return i == M;
		
	}
	
	public static void main(String[] agrv){
		
		OneEditDistance test = new OneEditDistance();
		String a = "ababac";
		String b = "abbac";
		
		boolean res = test.oneEditDistance(a, b);
		System.out.println(res);
		
	}

}
