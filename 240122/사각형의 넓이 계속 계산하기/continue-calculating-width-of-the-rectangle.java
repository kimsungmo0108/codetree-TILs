public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        String[] c = new String[100];
        for(int i=0; true; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.next();
            if((c[i]).equals("C")){
                break;
            }
        }

        for(int i=0; true; i++){
            System.out.printf("%d\n", (a[i]*b[i]));
            if((c[i]).equals("C")){
                break;
            }
        }
    }
}