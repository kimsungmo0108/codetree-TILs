public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
         java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] b = new int[100];
        byte c = 0;
        while (true) {
        if (c >= 3) {
            break;
        } else {
            int a = sc.nextInt();
            if (a % 2 == 1) {
                continue;
            } else {
                b[c] = a / 2;
                c++;
            }
        }
        }

        for (int j=0; j<c; j++) {
            if ((b[j]*2)%2 == 1) {
                continue;
            } else {
                System.out.println(b[j]);
            }
        }
    }
}