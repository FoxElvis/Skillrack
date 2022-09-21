/*
Array Product Except Index Value [AMAZON]

An array of N integers with non-zero values is passed as the input to the program. The program must print another array of size N where value at each index will be the product of all values in the input array except the value at that index in the input array.

Input Format:
The first line will contain N integers separated by a space.

Output Format:
The first line will contain N integers separated by a space.

Boundary Conditions:
The length of the input containing N integers will be from 3 to 100.
The integer values will be from 1 to 100.

Example Input/Output 1:
Input:
1 2 3 4 5

Output:
120 60 40 30 24

Example Input/Output 2:
Input:
10 5 4

Output:
20 40 50

Example Input/Output 3:
Input:
21 100

Output:
100 21
*/
import java.util.*;
public class ArrayProductExceptIndexValue {
	public static void main(String[] args) {
		String s[]=new Scanner(System.in).nextLine().split(" ");
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		} 
		int pro=1;
		for(int i=0;i<a.length;i++){
			pro=1;
			for(int j=0;j<a.length;j++){
				pro*=a[j];
			}
			System.out.print(pro/a[i]+" "); 
		}
	}
}
