package newproblems;

public class ReadNCharactersGivenRead4II {
	
	private int offset = 0;
	private int bufbits = 0;
	
	public int read4(char[] buffer){
		return 4;
	}
	
	public int read(char[] buf, int n){
		
		int len = 0;
		boolean eof = false;
		
		while (!eof && len < n){
			
			char[] buffer = new char[4];
			
			int size = 0;
			if (bufbits != 0){
				size = bufbits;
			}
			else{
				size = read4(buffer);
			}
		
			if (bufbits == 0 && size < 4){
				eof = true;
			}
			
			int readByte = Math.min(size, n - len);
			
			for (int i = 0; i < readByte; i++){
				buf[len + i] = buffer[(offset + i)% 4];
			}
			
			offset = (offset + size)% 4;
			bufbits = size - readByte;
			
			len += readByte;
		}
		
		return len;
	}

}
