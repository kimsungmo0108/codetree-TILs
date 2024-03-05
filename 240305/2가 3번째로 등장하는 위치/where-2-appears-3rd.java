public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int c=0;
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(num[i]==2){
                c++;
                if(c==3){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}