public class MultiDimeArray {  // Array of Array
    public static void main(String[] args) {
        int num[][]=new int[3][4];  // each section has 4 elements 
        // printing
        //int random=Math.random();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++){
                System.out.print(num[i][j]+" ");
                
            }
            System.out.println();
        }

    }
}
 