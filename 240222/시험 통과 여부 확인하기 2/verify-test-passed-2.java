public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int c = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                sum[i] += sc.nextInt();
            }
        }
        for(int k=0; k<n; k++){
            if((sum[k]/4)>=60){
                System.out.println("pass");
                c++;
            }else{System.out.println("fail");}
        }
        System.out.println(c);
    }
}