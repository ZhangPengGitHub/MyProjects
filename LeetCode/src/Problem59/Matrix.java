package Problem59;
public class Matrix {
	public static int[][] spiralOrder(int n) {
		int[][] result = new int [n][n];
        int row = n;
        int col = n;
        if(n == 0){
            return result;
        }
        int x = 0;
        int y = 0;
        row--;
        col--;
        int res = 1;
        while(x<=row && y<=col){
            for(int i=y;i<=col;i++){
                result[x][i]=res++;
            }
            x++;
            for(int i=x;i<=row;i++){
                result[i][col]=res++;
            }
            col--;
            for(int i=col;i>=y && x<=row;i--){
                result[row][i]=res++;
            }
            row--;
            for(int i=row;i>=x && y<=col;i--){
                result[i][y]=res++;
            }
            y++;
        }
        return result;
    }
	public static void main(String[] args){
		int n = 5;
		int[][] result = spiralOrder(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
