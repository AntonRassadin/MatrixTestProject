import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*        TwoDemencialMatrix testTwoMatrix1 = new TwoDemencialMatrix();
        testTwoMatrix1.printMatrix();
        System.out.println("__________________");
        TwoDemencialMatrix testTwoMatrix2 = new TwoDemencialMatrix(2,2);
        testTwoMatrix2.printMatrix();
        System.out.printf("Max: %d Min: %d \r\n", testTwoMatrix2.max(), testTwoMatrix2.min());
        System.out.println("__________________");*/
        //TwoDimMatrixWithZeroSum testZeroMatrix = new TwoDimMatrixWithZeroSum(4, 4);
        TwoDimMatrixWithZeroSum testZeroMatrix = new TwoDimMatrixWithZeroSum();
        testZeroMatrix.printMatrix();
/*        try{
            Field field=testZeroMatrix.getClass().getDeclaredField("nameMassive");
            field.setAccessible(true);
            System.out.println(field.get(testZeroMatrix));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/


        /*OneDemencialMatrix testMatrix1= new OneDemencialMatrix();
        testMatrix1.printMatrix();
        System.out.println("__________________");
        OneDemencialMatrix testMatrix2= new OneDemencialMatrix(10);
        testMatrix2.printMatrix();
        System.out.println("Min" + testMatrix2.min());
        System.out.println("Count Positive: "+testMatrix2.countPositive());

        OneDemencialMatrixPositive testPositive3= new OneDemencialMatrixPositive();
        testPositive3.printName();
        System.out.println("__________________");
        testPositive3.printMatrix();*/
        /*ArrayList<String> people = new ArrayList<>();
        people.add("Kotlin1");
        people.add("Kotlin2");
        people.add("Kotlin3");
        people.add("Kotlin4");

        System.out.println(people.get(1));

        people.set(1,"Gladiolus");

        System.out.println(people.get(1));

        if(people.contains("Kotlin3"))
            System.out.println("True");
        else
            System.out.println("False");

        people.remove(0);
        people.remove("Gladiolus");

        System.out.println(people);

        System.out.println("________");


        Object[] peopleArray=people.toArray();
        for(Object person : peopleArray)
            System.out.println(person);

    OneDemencialMatrix testReflaction = new OneDemencialMatrix();
        try {
            Field field=testReflaction.getClass().getDeclaredField("nameMassive");
            field.setAccessible(true);
            System.out.println(field.get(testReflaction));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
    }
}
