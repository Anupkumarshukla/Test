
public class RotateMatrix90degreeAnticlockwise {

    public static void main(String arg[]){

        int A[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        RotateMatrix90degreeAnticlockwiseUsingTranspose(A,A.length);
       // System.out.println("Rotate Matrix 90 degree Anticlockwise Using BruteForce is : "+ RotateMatrix90degreeAnticlockwiseUsingBruteForce(A,A.length));


    }

/*    static int[][] RotateMatrix90degreeAnticlockwiseUsingBruteForce(int A[][],int n){

        int temp[][]=new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                temp[n-j-1][i] = A[i][j];
            }
        }

        return temp;
    }*/

    static void RotateMatrix90degreeAnticlockwiseUsingTranspose(int A[][],int n){

        for (int i = 0; i < n; i++){
            for(int j = i ; j < n; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" "+ A[i][j]);
            }
            System.out.println("\n");
        }

        int i = 0, j = 0, column = 0;
        while (column < n){
             i = 0;
             j = n -1;
            while (i < j){
                int temp = A[i][column];
                A[i][column] = A[j][column];
                A[j][column] = temp;
                i = i + 1;
                j = j - 1;
            }
            column = column + 1;
        }
    }
}
