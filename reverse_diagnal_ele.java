// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [][] mat = {{2,3,6},{3,7,5},{9,0,2}};
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0;i<r;i++){
            //for(int j=0;j<c;j++){
                //if(mat[i]==mat[j]){
                int j = c-i-1;
                    System.out.println(mat[i][j]);
                //}
                        

            //}
        }
    }
}