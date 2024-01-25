public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        for(; a<=b ; a++){
            if(a%c == 0){
                count++;
            }
        }

        if(count>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}