import java.io.*;
import java.util.Scanner;

class greatestProduct{
    public static int up(int[][] matrix,int startRow,int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow - 1][startColumn] * matrix[startRow-2][startColumn] * matrix[startRow - 3][startColumn];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int down(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow + 1][startColumn] * matrix[startRow + 2][startColumn] * matrix[startRow + 3][startColumn];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int left(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow][startColumn - 1] * matrix[startRow][startColumn - 2] * matrix[startRow][startColumn - 3];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int right(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow][startColumn + 1] * matrix[startRow][startColumn + 2] * matrix[startRow][startColumn + 3];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int diagonalUpLeft(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow - 1][startColumn - 1] * matrix[startRow - 2][startColumn - 2] * matrix[startRow - 3][startColumn - 3];
	} catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int diagonalUpRight(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow + 1][startColumn + 1] * matrix[startRow + 2][startColumn + 2] * matrix[startRow + 3][startColumn + 3];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int diagonalDownLeft(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow + 1][startColumn - 1] * matrix[startRow + 2][startColumn - 2] * matrix[startRow + 3][startColumn - 3];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static int diagonalDownRight(int[][] matrix, int startRow, int startColumn){
	try{
	return matrix[startRow][startColumn] * matrix[startRow + 1][startColumn + 1] * matrix[startRow + 2][startColumn + 2] * matrix[startRow + 3][startColumn + 3];
	}catch(ArrayIndexOutOfBoundsException e){return 1;}
    }
    public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(new FileInputStream(args[0]));
	int[][] table = new int[20][20];
	for(int i = 0; i < 20; i++){
	    for(int j = 0; j<20; j++){
		table[i][j] = sc.nextInt();
	    }
	}
	int greatestProduct = 0;
	for(int i = 0; i < 20; i++)
	    for(int j = 0; j < 20; j++){
		if(up(table,i,j) > greatestProduct)
		    greatestProduct = up(table,i,j);
		else if(down(table,i,j) > greatestProduct)
		    greatestProduct = down(table,i,j);
		else if(left(table,i,j) > greatestProduct)
		    greatestProduct = left(table,i,j);
		else if(right(table,i,j) > greatestProduct)
		    greatestProduct = right(table,i,j);
		else if(diagonalUpLeft(table,i,j) > greatestProduct)
		    greatestProduct = diagonalUpLeft(table,i,j);
		else if(diagonalUpRight(table,i,j) > greatestProduct)
		    greatestProduct = diagonalUpRight(table,i,j);
		else if(diagonalDownLeft(table,i,j) > greatestProduct)
		    greatestProduct = diagonalDownLeft(table,i,j);
		else if(diagonalDownRight(table,i,j) > greatestProduct)
		    greatestProduct = diagonalDownRight(table,i,j);
	    }
	System.out.println(greatestProduct);
	
    }
}
