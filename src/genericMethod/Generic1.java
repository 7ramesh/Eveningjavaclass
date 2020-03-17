package genericMethod;

public class Generic1 {
	public static void main(String args[]) {
		System.out.println(max(40,50,70));
		System.out.println(max("Apple", "Mango", "Banana"));
	}
public static <T extends Comparable<T>> T max (T a, T b, T c) {
	T m = a;
	if(b.compareTo(a)	>0)
		m = b;
	if (c.compareTo(m)	>0)
		m = c;
	return m;
	}
}

