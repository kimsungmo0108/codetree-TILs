public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while(i<=a){
            if(i%3 == 0){System.out.printf("%d ", i);}
            i++;
        }
    }
}