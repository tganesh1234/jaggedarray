package gani.assignments;

public class Jaggedarray {

	public static void main(String[] args) {
		// create a jagged array
		int[][]a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[4];
		// first row 
		a[0][0]=10;
		a[0][1]=11;
		a[0][2]=12;
		a[0][3]=11;
		// second row
		a[1][0]=15;
		a[1][1]=16;
		a[1][2]=17;
		// third row
		a[2][0]=20;
		a[2][1]=22;
		a[2][2]=24;
		a[2][3]=26;
		System.out.println("jagged_array_is :");
	for (int i=0;i<3;i++) {
		for (int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
		
	}
	}
}
