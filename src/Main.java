public class Main {
    public static void main(String[] args) {
        int[][] array1 = {
                            {4,9,5,2},
                            {3,10,1,6},
                            {13,1,2,4}
                         };

        System.out.println(isRowMagic(array1));
    }

    public static boolean isRowMagic(int[][] arr){
        int sumRow;
        int[] array = new int[arr[0].length-1];

        for(int row = 0; row < arr.length; row++) {
            sumRow = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sumRow += arr[row][col];
            }
            array[row] = sumRow;
        }

        int sumTotal = array[0];
        int length = array.length;
        int equalTotal = 0;

        for(int j = 0; j < array.length; j++){
            if(sumTotal == array[j]){
                equalTotal += 1;
            }
        }

        if(equalTotal == length){
            return true;
        }
        else{
            return false;
        }
    }
}