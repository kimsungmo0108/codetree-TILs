import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String inputStr = sc.next();
        String targetStr = sc.next();

        // 문자열의 길이를 구합니다.
        int inputLen = inputStr.length();
        int targetLen = targetStr.length();

        // 입력 문자열의 각 문자를 시작점으로 하여 목적 문자열을 만들 수 있는지 확인합니다.
        for(int i = 0; i < inputLen; i++) {
            // inputStr의 i 부터 i + targetLen - 1까지의 원소가
            // targetLen의 0부터 targetLen - 1 까지의 원소와
            // 정확히 일치하는지 확인합니다.
            
            // 만약 inputStr의 끝 원소인 i + targetLen - 1 번째가
            // 존재하지 않는다면 비교를 하지 않습니다.
            if(i + targetLen - 1 >= inputLen)
                continue;
            
            // inputStr의 sIdx1에서 eIdx1 까지의 문자열과
            // outputStr의 sIdx2에서 eIdx2 까지의 문자열과 일치하는지를 비교합니다.
            boolean isMatched = true;
            for(int j = 0; j < targetLen; j++) {
                if(inputStr.charAt(i + j) != targetStr.charAt(j))
                    isMatched = false;
            }
            
            if(isMatched) {
                // 모든 문자에 대하여 매칭이 된 경우:
                System.out.print(i);
                System.exit(0);
            }
        }

        // 매칭이 되지 않는 경우:
        System.out.print(-1);
    }
}