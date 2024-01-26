public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for(; a<=b; a++){
            if(1920%a==0 || 2880%a==0){
                c++;
            }
        }
        if(c>0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}