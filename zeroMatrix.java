public class zeroMatrix{



public static void convertMatrix(int[][] matrix)
{
/*could use bitvector to boot efficiency*/
HashSet zRow= new HashSet();
HashSet zCol= new HashSet();

for(int i=0;i<matrix.length;i++)
  for(int j=0;j<matrix[0].length;j++)
     if(matrix[i][j]==0)
        {
         zRow.add(i);
         zCol.add(j);

}
for(int x=0;x<matrix.length;x++)
  for(int y=0;y<matrix[0].length;y++)
    if(zRow.contains(x)||zCol.contains(y))
            matrix[x][y]=0;
}

public static void main(String[] args)
{
  int [][] matrix = new int[3][4];
                for(int i=0;i<3;i++)
                	for(int j=0;j<4;j++)
                		matrix[i][j]=1;
                matrix[2][1]=0;
               // matrix[0][3]=0;
             //   matrix[1][1]=0;
                convertMatrix(matrix);
                for(int i=0;i<3;i++){
                	for(int j=0;j<4;j++)
                		System.out.print(matrix[i][j]);
                System.out.print("\n");


}

}
