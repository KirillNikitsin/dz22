import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;
//Здравствуйте, видел ваш комментарий под прошлым заданием, но к сожалению у меня повышенная нагрузка на работе и 
//ускорится я пока не могу
//Возникла проблема с проверкой массива, первые несколько раз когда я запускал этот код, программа работала так как нужно по задани
//а дальше начали возникать ошибки, я и не могу найти где я закосячил

public class dz22 {
    private static class MyArraySizeException extends RuntimeException{
        public MyArraySizeException(String s) {
            super(s);
        }
    }
    private static class MyArrayDataException extends NumberFormatException{
        public MyArrayDataException(String w) {
            super(w);
        }
    }
        private static void arr(int a, int b) {
            String[][] arr = new String[a][b];
            int[][] arr1 = new int[a][b];
            arr[0][0] = String.valueOf(1);
            arr[0][1] = String.valueOf(11);
            arr[0][2] = String.valueOf(13);
            arr[1][0] = String.valueOf(15);
            arr[1][1] = String.valueOf(16);
            arr[1][2] = String.valueOf(81);
            arr[2][0] = String.valueOf(981);
            arr[2][1] = String.valueOf(91);
            arr[2][2] =" Sasda";
            int sum = 0;
            for(a = 0; a < arr.length; a++) {
                for (b = 0; b < arr.length; b++) {
                    try {
                        arr1[a][b] = Integer.parseInt(arr[a][b]);
                        sum = sum + arr1[a][b];
                    } catch (MyArrayDataException w) {
                        System.out.println("Значение не соответствует");
                    }
                }
            }
            System.out.println(sum);
            if (a != 3 || b != 3) {
                throw new MyArraySizeException("neverniy massiv");
            }
            System.out.println(arr.length);
        }
        public static void main(String[] args) {
            arr(3,3);

        }
    }