
public class MatrixTest {

	public static void main(String[] args) {
		int[][] mat1={{10,20,30},{40,50,60}};
		int[][] mat2={{1,4},{2,5},{3,6}};
		
		int product[][];
		product = new int[2][2];
		
		//i is the row entry of the product matrix
		for(int i=0; i<mat1.length; i++){
			//j is the column entry of the product matrix
			for(int j=0; j<mat2[0].length; j++){
				//product[i][j] = mat1[i][0]*mat2[0][j]+mat1[i][1]*mat2[1][j]+mat1[i][2]*mat2[2][j];
				for(int k=0; k<mat1[0].length; k++){
					//for entry i,j in product, multiply mat1 i,k to mat2 k,j
					product[i][j] +=  mat1[i][k] * mat2[k][j];
				}
				//leave a space after every entry
				System.out.print(product[i][j]+"\t");
			}
		//leave a line after all the columns in the row is completed	
		System.out.println();	
		}
		
		

		
		
	}
	
	
}
;