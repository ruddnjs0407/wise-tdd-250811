package com.back;

import java.util.Scanner;

public class App {

    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine(); // 종료가 안되면 돌아와서 입력값이 꼬일 수 있음

            if (cmd.equals("등록")) {
                System.out.print("명언: ");
                String saying = sc.nextLine();
                System.out.print("작가: ");
                String author = sc.nextLine();
            } else if (cmd.equals("종료")){
                break;
            }
        }
    }


}
