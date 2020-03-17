package thread;
 import java.util.*;
 
public class Single extends Thread {
	public void run() {
		for (int i = 0; i<=5; i++) {
		System.out.print(i);
	}
	}



	public static void main(String[] args) {
		Single S=new Single();
		S.start();
	}
	}


