import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CountArrayElement {

    public static int CountOfArrayElements(int[] array){
        int size = array.length;
        int max = Integer.MIN_VALUE, counter = 0;
        for(int i = 0; i < size; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        for(int i = 0; i < size; i++){
            if(max == array[i]){
                counter++;
            }
        }
        return size-counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(CountOfArrayElements(array));
    }
}