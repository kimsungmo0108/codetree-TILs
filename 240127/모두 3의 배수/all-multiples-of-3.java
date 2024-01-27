public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] num = new int[5];
        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
        }
        if(num[0]%3==0&&num[1]%3==0&&num[2]%3==0&&num[3]%3==0&&num[4]%3==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}