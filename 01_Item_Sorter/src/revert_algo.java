import java.util.Random;

public class revert_algo {
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
        return revertArray(data);
    }
    public static int[] revertArray(int[] data){

        for(int i=data.length-1;i>=0;i--)
            data[i] + "  ";
    }
    }
}
