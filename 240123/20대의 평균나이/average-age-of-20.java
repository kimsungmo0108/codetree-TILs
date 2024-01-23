public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int age = 0;
        int total = 0;
        int c = 0;
        while(true){
            age = sc.nextInt();
            if(age >= 30 || age<20){
                break;
            }else{
                total += age;
                c++;
            }
        }
        System.out.printf("%.2f", ((float)total/c));
    }
}