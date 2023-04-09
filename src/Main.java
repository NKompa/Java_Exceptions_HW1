import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] a1 = new int[] {6,10,8};
        int[] a2 = new int[] {2,5,3};
        System.out.println(Arrays.toString(minusArr(a1,a2)));
        System.out.println(Arrays.toString(divArr(a1,a2)));
        System.out.println(Arrays.toString(divIntArr(a1,a2)));
    }

    //1. Метод принимает два целочисленных массива, возвращает новый массив, где элемент = разности элементов 2-х входящих массивов.
    //Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] minusArr(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i]-arr2[i];
        }
        return result;
    }

    //2. Метод принимает два целочисленных массива, возвращает новый массив, где элемент = частному элементов 2-х входящих массивов.
    //Если длины массивов не равны, необходимо оповестить пользователя.
    //При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static int[] divArr(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]==0){
                throw new RuntimeException("Деление на 0 не приветствуется");
            }
            result[i] = arr1[i]/arr2[i];
        }
        return result;
    }

    //3. Метод 2 + исключение, если при делении получается дробное число.
    public static int[] divIntArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0 не приветствуется");
            }
            result[i] = arr1[i] / arr2[i];
            if (arr1[i] % arr2[i] != 0) {
                throw new RuntimeException("При делении получилось дробное число");
            }
        }
        return result;
    }
}
