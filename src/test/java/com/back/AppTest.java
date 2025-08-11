package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    @DisplayName("== 명언 앱 == 출력")
    void t1() {
        String out = AppTestRunner.run("종료");
        assertThat(out).contains("== 명언 앱 ==");
    }

    @Test
    @DisplayName("등록")
    void t2() {

        String out = AppTestRunner.run("""
                등록
                현재를 사랑하라.
                작자미상
                """); //종료를 빼먹으면 무한 루프
        assertThat(out).contains("명령) ");
        assertThat(out).contains("명언: ");
        assertThat(out).contains("작가: ");
    }

    @Test
    @DisplayName("등록 시 명언 번호 노출")
    void t3() {
        String out = AppTestRunner.run("""
                등록
                현재를 사랑하라.
                작자미상
                """); //종료를 빼먹으면 무한 루프

        assertThat(out).contains("1번 명언이 등록되었습니다.");
    }
}
