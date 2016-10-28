package array;

import java.util.Scanner;

public class array_test {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		final int SIZE = in.nextInt();
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		//输入board
		for( int i = 0; i < board.length; i++){
			for( int j = 0; j < board[i].length; j++){
				board[i][j] = in.nextInt(); 
			}
		}
		//检查行
		if(!gotResult){
			for( int i = 0; i < board.length; i++){
				numOfX = 0;
				numOfO = 0;
				for( int j = 0; j < board[i].length; j++){
					if( board[i][j] == 1){
						numOfX++;
					}else{
						numOfO++;
					}
				}
				if(numOfX == SIZE || numOfO == SIZE){
					gotResult = true;
					break;
				}
			}
		}
		//检查列
		if(!gotResult){			
			for(int i = 0; i < board[1].length; i++){
				numOfX = 0;
				numOfO = 0;
				for( int j = 0; j < board.length; j++){
					if( board[j][i] == 1){
						numOfX++;
					}else{
						numOfO++;
					}
				}
				if(numOfX == SIZE || numOfO == SIZE){
					gotResult = true;
					break;
				}
			}
		}
		//检查对角线
		if(!gotResult){	
			numOfX = 0;
			numOfO = 0;
			for(int i = 0; i < board.length; i++){
				if(board[i][i] == 1){
					numOfX++;
				}else{
					numOfO++;
				}
			}
			if(numOfX == SIZE || numOfO == SIZE){
				gotResult = true;
			}
		}
		//检查反对角线
		if(!gotResult){
			numOfX = 0;
			numOfO = 0;
			for(int j = 0; j < board.length; j++){
				if(board[j][SIZE-j-1] == 1){
					numOfX++;
				}else{
					numOfO++;
				}
			}
			if(numOfX == SIZE || numOfO == SIZE){
				gotResult = true;
			}
		}
		if(gotResult){
			if(numOfX == SIZE){
				System.out.println("X");
			}else{
				System.out.println("O");
			}
		}else{
			System.out.println("NIL");
		}
	}

}
