package WeekTwo;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args){
        List<Integer> row = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(3);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(row);
        row1.add(4);
        row1.add(5);
        row1.add(6);
        matrix.add(row1);
        row2.add(9);
        row2.add(8);
        row2.add(9);
        matrix.add(row2);
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size();j++){
                if(i == j)
                    diagonalSum1 += matrix.get(i).get(j);
                if(i + j == matrix.size()-1)
                    diagonalSum2 += matrix.get(i).get(j);
            }
        }
        System.out.println(Math.abs(diagonalSum1 - diagonalSum2));
    }
}
