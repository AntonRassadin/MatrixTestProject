import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.random;

public class TwoDemencialMatrix implements MatrixInterface {

    public int[][] array;
    protected int amountFirstDim;
    protected int amountSecondDim;
    private String nameMassive="TwoDemencialMatrix";

    TwoDemencialMatrix(){
        amountFirstDim = 5;
        amountSecondDim = 5;
        array = new int[amountFirstDim][amountSecondDim];
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((random() * 12) - 6);
            }
        }

    }

    public void printMatrix(){
        for(int[] i : array){
            for(int j : i) {
                System.out.println(j);
            }
        }
    }

    TwoDemencialMatrix(int amountFirstDim, int amountSecondDim){
        this.amountFirstDim=amountFirstDim;
        this.amountSecondDim=amountSecondDim;
        array = new int[amountFirstDim][amountSecondDim];
        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((random() * 12) - 6);
            }
        }

    }

    protected void printName(){
        System.out.println(nameMassive);
    }

    @Override
    public int min() {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).min().getAsInt();
    }

    @Override
    public int max() {
        return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).max().getAsInt();
    }
}