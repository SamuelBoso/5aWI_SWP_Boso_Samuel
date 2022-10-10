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
            data[i] = random.nextInt(100000-1)+1;
        }
        return sortDataArray(data);
    }
    public static int[] sortDataArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            int sortset = data[i];
            int j = i - 1;
            while(j >= 0 && data[j] > sortset){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = sortset;
        }
        return data;
    }
}
