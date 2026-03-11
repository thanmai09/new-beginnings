
class Main {
    public static void main(String[] args) {
        int [][] mat = {{2,3,6},{3,3,5},{9,3,2}};
        int r = mat.length;
        int c = mat[0].length;
        int i = 1;
        int j = 0;
        boolean invalid = true;
        int temp = mat[i][j];
        while(i<r && j<c){
            if(mat[i][j]!=temp){
                invalid = false;
            }
            i++;
            j++;
        }
        System.out.println(invalid);
    }
}