// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [][] mat = {{2,3,6},{3,7,5},{9,0,2}};
        int r = mat.length;
        int c = mat[0].length;
        int i = 0;  //the change happens here by changing i & j values as accordingly
        int j = 1;
        while(i<r && j<c){
            System.out.println(mat[i][j]);
            i++;
            j++;
        }
    }
}