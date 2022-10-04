import java.sql.SQLOutput;
import java.util.Random;

public class mySort {
    public static void main(String[] args) {
        int size = 10;
        int[] data = generateDataArray(size);
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }


    public static int[] generateDataArray(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            Random random = new Random();
            data[i] = random.nextInt(100-1)+1;
        }
        return data;
    }
    public static int[] sortDataArray(int data){

    }
}
