package ArrayList;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Order_Strings2 {
	public static void main(String[] args) throws IOException {
		Reader sc= new Reader();
		int n= sc.nextInt();
		String [][]choice= new String[n][];
		for(int i=0;i<n;i++){
			choice[i]=sc.readLine().split(" ");
		}
		String[] last=sc.readLine().split(" ");
		int key=Integer.parseInt(last[0]);
		boolean reverse=(last[1].charAt(0)=='t')?true:false;
		boolean sort = (last[2].charAt(0)=='l')?true:false; 
		// sort=> true-lex........ false-num
		
		if(sort){
			sortLexico(choice,key);
			if(reverse){
				for(int i=n-1;i>=0;i--){
					for(int j=0;j<choice[0].length;j++){
						System.out.println(choice[i][j]+" ");
					}
					System.out.println();
				}
				
			}else{
				for(String[]pp:choice){
					for(String rr:pp){
						System.out.println(rr+" ");
					}
					System.out.println();					
				}
			}
			
		}
		else{
			sortNumeric(choice,key);
			if(reverse){
				for(int i=n-1;i>=0;i--){
					for(int j=0;j<choice[0].length;j++){
						System.out.println(choice[i][j]+" ");
					}
					System.out.println();
				}
				
			}else{
				for(String[]pp:choice){
					for(String rr:pp){
						System.out.println(rr+" ");
					}
					System.out.println();					
				}
			}
		}		
	}

	private static void sortNumeric(String[][] choice, int key) {
		// TODO Auto-generated method stub
		Arrays.sort(choice, new Comparator<String[]>() {

			@Override
			public int compare(String[] a, String[] b) {
				// TODO Auto-generated method stub
				BigInteger aa=new BigInteger(a[key-1]);
				BigInteger bb=new BigInteger(b[key-1]);
				return aa.compareTo(bb);
			}
		});		
	}
	
	private static void sortLexico(String[][] choice, int key) {
		// TODO Auto-generated method stub
		Arrays.sort(choice, new Comparator<String[]>() {

			@Override
			public int compare(String[] a, String[] b) {
				// TODO Auto-generated method stub
				return a[key-1].compareTo(b[key-1]);
			}
		});
	}
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}
