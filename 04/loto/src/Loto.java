
public class Loto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = task();
		for(int i = 0; i<7; i++) {
		System.out.print((number&0xff) + " ");
		number>>=8;
		}

	}
	
	public static long task() {
		long buf=0;
		for(int i=0;i<7;i++) {
			byte number = getNumber();
			long buf_copy=buf;
			do {
				if((buf_copy&0b11111111)==number) {
					buf_copy=buf;
					number = getNumber();					
				}
				buf_copy>>=8;
			}while(buf_copy!=0);
			
			buf=buf<<8|number;
		}
		return buf;
	}
	
	public static byte getNumber() {
		return (byte) (1+Math.random()*49);	
	}

}