import java.util.Random;

public class Max_Min_Algo {
    public static void main(String[] args) {
        int size = 10;
        generateDataArray(size);
    }
    public static void generateDataArray(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            Random random = new Random();
            data[i] = random.nextInt(100000 - 1) + 1;
        }
        //return revert(data);
        System.out.println("Highest value:" + max(data,size));
        System.out.println("Lowest value:" +  min(data,size));
    }

    //Max-Algorithmus
    public static int max(int[] data, int size) {
        int max = data[0];
        for (int i = 1; i < data.length; i++)
            if (data[i] > max)
                max = data[i];

        for (int i = 0; i < size; i++) {
            System.out.println("This is " + i + " character in the array:" + data[i]);
        }
        return max;
    }

    //Min-Algorithmus
    public static int min(int[] data, int size){
        int min = data[0];
        for (int i = 1; i < data.length; i++)
            if (data[i] < min)
                min = data[i];
        return min;
    }
}
