public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(c==1){c=10;}
                System.out.print(--c);
            }
            System.out.println();
        }
    }
}