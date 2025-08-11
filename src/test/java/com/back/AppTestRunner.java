package com.back;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public static String run(String str) {

        Scanner sc = TestUtil.genScanner(str + "\n종료");

        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        new App(sc).run(); // 선입력된 테스트 스캐너를 사용해야함
        return outputStream.toString();
    }
}
