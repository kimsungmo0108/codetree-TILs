public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] word = new String[]{ "L", "E", "B", "R", "O", "S" };
        String str = sc.next();
        int index = -1;
        for(int i=0; i<6; i++){
            if(str.equals(word[i])){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("None");
        }else{
        System.out.println(index);
        }
    }
}