package day08home;

import java.util.Scanner;

public class MethodEx01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        // 배열 생성
        int[] array = createArray(size);

        // 생성된 배열 출력 확인용
        System.out.println("생성된 배열:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // 배열 생성 메소드
    public static int[] createArray(int size) {
        int[] array = new int[size];

        // 배열 요소에 값 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
