import java.util.ArrayList;
import java.util.Scanner;

public class Hunter_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ak = sc.nextInt();
		int arr[] = new int[ak];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
	ArrayList ar=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==i) {
			ar.add(i);
		}
	}
		int a[]=new int[ar.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)ar.get(i);
			
		System.out.print(a[i]+" ");
		}
		
	}
	
	
	}
