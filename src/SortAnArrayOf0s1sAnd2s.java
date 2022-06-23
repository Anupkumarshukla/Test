import java.util.Arrays;


public class SortAnArrayOf0s1sAnd2s {

    public static void main(String arg[]){
        int A[] = {0,2,1,0,1,2,1,0};
        System.out.println("Sort An Array Of 0s 1s And 2s Using Brute Force is : "+ sortarray(A,A.length));

      //  System.out.println("Sort An Array Of 0s 1s And 2s Using Brute Force is : "+ SortAnArrayOf0s1sAnd2sUsingBruteForce(A,A.length));


    }

/*
    static String SortAnArrayOf0s1sAnd2sUsingBruteForce(int A[],int n){

        int countZero = 0, countOne = 0, countTwo = 0;

        for (int i = 0; i < n; i++){
            if(A[i] == 0){
                countZero = countZero + 1;
            }
            if(A[i] == 1){
                countOne = countOne + 1;
            }
            if(A[i] == 2){
                countTwo = countTwo + 1;
            }
        }
        int i= 0;
        while (countZero != 0){
            A[i] = 0;
            i = i + 1;
            countZero = countZero - 1;
        }

        while (countOne != 0){
            A[i] = 1;
            i = i + 1;
            countOne = countOne - 1;
        }

        while (countTwo != 0){
            A[i] = 2;
            i = i + 1;
            countTwo = countTwo - 1;
        }


        return Arrays.toString(A);
    }
*/

   static String SortAnArrayOf0s1sAnd2sUsingElementSwapping(int A[],int n){

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high)
        {
            if(A[mid] == 0){
                swap(A,A[low],A[mid]);
                low = low + 1;
                mid = mid + 1;
                continue;
            }
            if(A[mid] == 1){
                mid = mid + 1;
                continue;
            }
            if(A[mid] == 2){
                swap(A, A[mid],A[high]);
                high = high - 1;
                continue;
            }
        }

        return Arrays.toString(A);
    }

    static  void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    /* static void swap (int[] A, int i, int j) {
         int tmp = A[i];
         A[i] = A[j];
         A[j] = tmp;
    }*/
  /*  static String sort_array_0_1_2 ( int A[ ] , int n )
    {
        int low = 0 , mid = 0 ,  high = n - 1 ;
        while ( mid <= high )
        {
            if ( A [ mid ] == 0 )
            {
                swap ( A [ low ] , A [ mid ] ) ;
                low = low + 1 ;
                mid = mid + 1 ;
            }
            else if ( A [ mid ] == 1 )
            {
                mid = mid + 1 ;
            }
            else
            {
                swap ( A [ high ] , A [ mid ] ) ;
                high = high - 1  ;
            }
        }
        return Arrays.toString(A);
    }

    static void swap ( int x , int y )
    {
        int temp ;
        temp = x ;
        x = y ;
        y = temp;
    }*/


    static String sortarray ( int [] A , int n )
    {
        int low = 0 ;
        int mid = 0 ;
        int high = n - 1 ;
        while ( mid <= high )
        {
            if ( A [ mid ] == 0 )
            {
                int temp = A [ mid ] ;
                A [ mid ] = A [ low ];
                A [ low ] = temp ;
                low = low + 1 ;
                mid = mid + 1 ;

            }
            else if ( A [ mid ] == 1 )
            {
                mid = mid + 1 ;
            }
            else
            {
                int temp = A [ mid ] ;
                A [ mid ] = A [ high ] ;
                A [ high ] = temp ;
                high = high - 1 ;

            }
        }
        return Arrays.toString(A);
    }



}
