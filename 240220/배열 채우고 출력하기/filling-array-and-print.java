public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] c = new String[10];
        for(int i=0; i<10; i++){
            c[i] = sc.next();
        }
        for(int j=9; j>=0; j--){
            System.out.printf("%s", c[j]);
        }
    }
}