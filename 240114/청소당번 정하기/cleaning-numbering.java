public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        for(int i=1; i<=a; i++){
            if(i%2==0 && i%3==0 && i%12==0){
                c3++;
            }else if(i%2==0 && i%3==0){
                c2++;
            }else if(i%3 == 0){
                c2++;
            }else if(i%2 == 0){
                c1++;
            }
        }
        System.out.printf("%d %d %d", c1, c2, c3);
    }
}