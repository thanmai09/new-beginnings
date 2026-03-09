// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [][] arr = {{1,4,3},{9,4,6},{5,8,1}};
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i][j]);
                    
                }
                
            }
        }
    }
}