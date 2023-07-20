public class Matrix_Transpose {
    public static void main(String[] args) {
        int[][] ar= {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] tr= new int[3][3];
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++);
            {
                int c=0;
                tr[r][c]=ar[c][r];
            }
        }
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(tr[r][c]+" ");
            }
            System.out.println();
        }

    }

}
