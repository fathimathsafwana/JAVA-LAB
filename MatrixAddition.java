package safwana;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows,cols;

		//read matrix size
		System.out.print("enter number of rows:");
		rows=sc.nextInt();

		System.out.print("enter number of columns:");
		cols=sc.nextInt();

		int[][]A=new int[rows][cols];
		int[][]B=new int[rows][cols];
		int[][]C=new int[rows][cols];

		//read 1st matrix
		System.out.println("Enter elements of Matrix A:");
		for( int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
		A[i][j]=sc.nextInt();
		
			}
		}

		//read 2nd matrix
		System.out.println("Enter elements of Matrix B:");
		for( int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
		B[i][j]=sc.nextInt();
		
			}
		}
		
		//matrix addition
		for( int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
		C[i][j]=A[i][j]+B[i][j];
		
			}
		}
		
		//display result matrix
		System.out.println("Resultant Matrix (A+B):");
		for( int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
		}

	}
