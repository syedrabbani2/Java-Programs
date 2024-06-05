package javaSetProgramsMultiThreading;

class MatrixRowMultiplier implements Runnable {
	private final int[][] matrix1;
	private final int[][] matrix2;
	private final int[][] result;
	private final int row;

	public MatrixRowMultiplier(int[][] matrix1,int[][] matrix2,int[][] result,int row) {
		this.matrix1=matrix1;
		this.matrix2=matrix2;
		this.result=result;
		this.row=row;


	}@Override
	public void run() {
		for(int i=0;i<matrix2[0].length;i++) {
			result[row][i]=0;
			for(int j=0;j<matrix1[0].length;j++) {

			}
		}

	}

}

