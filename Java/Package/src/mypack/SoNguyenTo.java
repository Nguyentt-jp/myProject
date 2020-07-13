public class SoNguyenTo {

    public static void main(String[] args) {


        int n = 100;

        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    break;
                } else {
                    System.out.print(j);
                }
            }
        }
    }
}
