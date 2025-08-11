import com.back.App;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new App(new Scanner(System.in))
                .run();  //진짜 사용하는 프로그램이기 때문에 스캐너 새로

        //        experiment1();
        //        experiment2();
    }

    public static void experiment2() {
        //*출력 자동화*// -> 출력을 모니터가 아닌 문자열로
        System.out.println("안녕하세요");
        //printStream 객체임
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        System.out.println("하하하"); //저장소로 돌아가서 출력되지 않음

        String outStr = outputStream.toString();

        System.setOut(originalOut);
        printStream.close();
        System.out.println(outStr);

    }

    public static void experiment1() {
        //* 입력 자동화*//

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
