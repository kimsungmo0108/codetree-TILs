public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();
        int count=0;
        for(int i=0; i<n; i++){
            if(str.equals(sc.next())){
                count++;
            }
        }
        System.out.println(count);
    }
}