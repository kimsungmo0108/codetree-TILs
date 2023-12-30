public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a>b?a:b;
        int min = a<b?a:b;
        max = max>c?max:c;
        min = min<c?min:c;
        if(a == min){
            System.out.print("1 ");
        }else{System.out.print("0 ");}
        if(a == b && b == c){
            System.out.print("1 ");
        }else{System.out.print("0 ");}
    }
}