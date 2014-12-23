package newproblems;

public class ReadNCharactersGivenRead4 {
	
	public int read4(char[] buffer){
		return 4;
	}
	
	public int read(char[] buf, int n){
		
		int len = 0;
		boolean eof = false;
		
		while (!eof && len< n){
			
			char[] buffer = new char[4];
			
			int size = read4(buffer);
			
			if (size < 4){
				eof = true;
			}
			
			int readBytes = Math.min(n - len, size);
			for (int i = 0; i < readBytes; i++){
				buf[i + len] = buffer[i];
			}
			
			len += readBytes;
			
		}
		
		return len;
	}

}
