package selenium_Basics;

public class p1 {
public static void main(String[] args) {
	int k=0;
	int b[]=new int[k];
	int a[]= {1,1,2,2,3,3,4,4,5,5};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length-1;j++) {
			if(a[i]==a[j]) {
				b[k]=a[i];
				k++;
				
			}
		}
		
	}
	
	for(int m=0;m <b.length;m++) {
		System.out.println(b[m]);
	}
	
}
}
