package OOPs;

public class AnonymousOOP {
    public static void main(String[] args) {
        //goi phuong thuc cua doi tuong annonymous
        new AnonymousOOP().fact(10);
    }

    void fact(int n) {
        int giaiThua = 1;
        for (int i = 1; i < n; i++) {
            giaiThua *= i;
        }
        System.out.println("Giai thua cua " + n + " la: " + giaiThua);
    }

}
