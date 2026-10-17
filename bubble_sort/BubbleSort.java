public class BubbleSort{
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2) return;

        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args){
        int[] numbers = {4, 8, 2, 0, 1, 9, 3, 5, 7, 6};

        System.out.println("массив до сортировки:");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("массив после сортировки:");

        bubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


    }
}