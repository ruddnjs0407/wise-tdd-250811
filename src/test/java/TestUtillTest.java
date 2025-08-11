import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;


public class TestUtillTest {
    @Test
    @DisplayName("TestUtil.genScanner()")
    void t1() {
        //*테스트트 도구를 만들 떄도 TDD방식을 사용해도 된다*//
        Scanner sc = TestUtil.genScanner("""
                        등록
                        너 자신을 알라
                        소크라테스"""
        );

        String cmd = sc.nextLine();
        String saying = sc.nextLine();
        String author = sc.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(saying).isEqualTo("너 자신을 알라");
        assertThat(author).isEqualTo("소크라테스");
    }

    @Test
    @DisplayName("TestUtil.setOutToByteArray()")
    void t2() throws IOException {

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();

        System.out.println("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");

        String outStr = outputStream.toString();

        TestUtil.clearSetOutToByteArray(outputStream); //원상복구

        assertThat(outStr).contains("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");

        System.out.println("이제 화면에 출력됩니다.");
    }
}
