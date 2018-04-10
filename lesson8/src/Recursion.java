import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    createArray(scanner);
        getUserInput(scanner,1,5);

    }
    private static int getUserInput(Scanner scanner, int min,int max    ){
        scanner = new Scanner(System.in);

        System.out.println("Введите число от "+min+" до "+max);
        int result;
        try {
            result = scanner.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("Вели не число");
            return getUserInput(scanner, min, max);
        }if(result<min || result>max) {
            System.out.println("число не от " + min + " до " + max);
            return getUserInput(scanner, min, max);
        }
        return result;
            }


private static int[] createArray(Scanner scanner) {
    System.out.println("Введите длину");
    int length = scanner.nextInt();
    int[] array = new int[length];
    if (length == 0 || length > 10) {
        System.out.println("длина должна быть от 1 до 10");
        array = createArray(scanner);
    }
    System.out.println("последний элемент = " + array[length - 1]);
    return array;
}

    }


