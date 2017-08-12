package Chapter03;
//продемонстрировать применение трехмерного массива
public class ThreeDMatrix {
    public static void main(String args[]){
        int m3[][][]=new int[3][4][5];
        int i,j,k;
        for(i=0;i<3;i++)
            for(j=0;j<4;j++)
                for(k=0;k<5;k++)
                    m3[i][j][k]=i*j*k;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++)
                    System.out.print(m3[i][j][k]+" ");
            }
            System.out.println();
        }
    }
}
