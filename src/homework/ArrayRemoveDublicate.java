package homework;

public class ArrayRemoveDublicate {

	public static void main(String[] args) {
		int[] a = {1, 2, 4, 3, 4, 6, 4, 5, 5}; 
        int[] text = new int[a.length]; 
        int j=0;
        for(int i=0; i<a.length-1;i++) {
        	if(a[i]!=a[i+1]) {
        		text[j]=a[i];j++;
        	}
          
	}
        text[j]=a[a.length-1];
        for (int i=0;i<text.length; i++) {
        	System.out.print(text[i]+" ");
        }
}
}