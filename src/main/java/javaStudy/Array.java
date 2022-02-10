package javaStudy;

public class Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // 배열 복사
        b[3] = 0;

        for (int e : b) {
            System.out.println(e);
        }

    }
}
