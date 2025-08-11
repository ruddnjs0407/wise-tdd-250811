import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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


//        assertThat(out)
//                .contains("명언 :")
//                .contains("작가 :")
//                .contains("1번 명언이 등록되었습니다.");
    }
}
