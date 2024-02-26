public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int now=0;
        int[] num= new int[10];
        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
        }
        for(int j=0; j<10; j++){
            if(num[j]%3 == 0){
                System.out.printf("%d \n", num[j-1]);
                break;
            }
        }
    }
}