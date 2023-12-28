public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int temp = sc.nextInt();
        if(temp<0){
            System.out.println("ice");
        }else if(temp>=100){
            System.out.println("vapor");
        }else{
            System.out.println("water");
        }
    }
}