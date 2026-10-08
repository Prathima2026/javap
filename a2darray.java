public class a2darray {
    public static void main(String args[]){
    /* 3D array or Multtidiemensional array
    syntax: 
    datatype arrayname[blocks][rows][columns] = new datatype[blocksize][rowsize][colsize];

    ex:
    int a[][][] = new int[2][2][3];
         c  0  1  2
            00 01 02
     b-0    10 20 30

            10 11 12
     b-1    40 50 60
    */
    int a[][][] = new int[3][2][3];

    //storing
    //block-0
    a[0][0][0] = 10;
    a[0][0][1] = 20;
    a[0][0][2] = 30;

    //block-1
    a[1][1][0] = 40;
    a[1][1][1] = 50;
    a[1][1][2] = 60;

    //accessing
    System.out.println(a[0][0][0]);
    System.out.println(a[0][0][1]);
    System.out.println(a[0][0][2]);

    //printing through loop
    System.out.println("Block elements: ");
    for(int k=0; k<2; k++){
        System.out.println("Block: "+k);
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[k][i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }

}


