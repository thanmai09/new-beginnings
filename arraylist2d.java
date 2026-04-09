// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
       ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(5);
        temp.add(9);
        temp.add(2);
        arr.add(temp);
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(3);
        temp2.add(1);
        temp2.add(7);
        arr.add(temp2);
        ArrayList<Integer> temp3 = new ArrayList<>();
        temp3.add(3);
        temp3.add(1);
        temp3.add(7);
        arr.add(temp3);
        System.out.println(arr);
    }
}