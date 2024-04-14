import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열을 입력받습니다.
        String inputStr = sc.next();
        int qNum = sc.nextInt();

        int strSize = inputStr.length();
        
        int qType;
        for(int i = 0; i < qNum; i++) {
            qType = sc.nextInt();
            if(qType == 1) {
                // step1: 가장 앞의 문자를 저장한 뒤,
                // step2: 문자열을 앞부터 순회하며 문자를 한 칸씩 앞으로 당기고
                // step3: 문자열의 제일 뒤에 가장 앞에 있던 문자를 넣어줍니다.
                char[] arr = inputStr.toCharArray();

                char front = arr[0];              // step1
                for(int j = 1; j < strSize; j++) // step2
                    arr[j - 1] = arr[j];
                arr[strSize - 1] = front;        // step3

                inputStr = new String(arr);
                System.out.println(inputStr);
            }
            else if(qType == 2) {
                // step1: 가장 뒤의 문자를 저장한 뒤,
                // step2: 문자열의 뒤부터 순회하며 문자를 한 칸씩 뒤로 밀어주고
                // step3: 문자열의 제일 앞에 가장 뒤에 있던 문자를 넣어줍니다. 
                char[] arr = inputStr.toCharArray();

                char back = arr[strSize - 1];          // step1
                for(int j = strSize - 1; j >= 1; j--)  // step2
                    arr[j] = arr[j - 1];    
                arr[0] = back;					        // step3

                inputStr = new String(arr);
                System.out.println(inputStr);
            }
            else if(qType == 3) {
                // 문자열의 앞부터 순회하며 좌우 대칭 위치에 있는 문자와 swap해줍니다. 
                // 단, 문자열의 절반만 순회해줍니다.
                char[] arr = inputStr.toCharArray();

                char temp;
                for(int j = 0; j < strSize / 2; j++) {
                    temp = arr[j];
                    arr[j] = arr[strSize - j - 1];
                    arr[strSize - j - 1] = temp;
                }

                inputStr = new String(arr);
                System.out.println(inputStr);
            }
        }
    }
}