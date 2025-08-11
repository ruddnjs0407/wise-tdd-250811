import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        experiment1();
    }

    public static void experiment1() {


        String input = """
                등록
                너 자신을 알라""";  // \n(줄바꿈)을 기준으로 읽음 -> 쌍따음표도 동일
        Scanner sc = new Scanner(input);
        String cmd = sc.nextLine(); //입력이 완료될 때까지 대기
        String saying = sc.nextLine();
        System.out.println("입력한 명령어: "+ cmd);
        System.out.println("입력한 명언 "+ saying);
    }
}
