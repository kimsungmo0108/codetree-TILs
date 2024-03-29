public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        int count=0;
        char c = sc.nextLine().charAt(0);
        for(int i=0; i<5; i++){

                if(str[i].charAt(2)==c || str[i].charAt(3)==c){
                    count++;
                    System.out.println(str[i]);
                }
            
        }
        System.out.println(count);
    }
}