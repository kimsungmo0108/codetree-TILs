public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("John");
        }else if(a==2){
            System.out.println("Tom");
        }else if(a==3){
            System.out.println("Paul");
        }else{
            System.out.println("Vacancy");
        }
    }
}