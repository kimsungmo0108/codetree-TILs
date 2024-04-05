import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String str = sc.next();

        // 문자열 'ee'가 존재하는지 확인하고, 존재하면 Yes, 아니면 No를 출력합니다.
        if(str.contains("ee")) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        }

        // 문자열 'ab'가 존재하는지 확인하고, 존재하면 Yes, 아니면 No를 출력합니다.
        if(str.contains("ab")) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}