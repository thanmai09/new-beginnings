class Main {
    public static void main(String[] args) {

        int[][] mat = {
            {1,3,6},
            {3,1,5},
            {9,0,1}
        };

        boolean result = true;  // assume it is true first

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][i] != 1) {   // check diagonal element
                result = false;
                break;
            }
        }

        System.out.println(result);  // prints only once
    }
}