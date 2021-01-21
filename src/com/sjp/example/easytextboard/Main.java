package com.sjp.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("명령어 ) ");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String command = scanner.nextLine();

			if (command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");
				
				String title;
				String body;
				
				System.out.printf("제목 : ");
				title = scanner.nextLine();
				System.out.printf("내용 : ");
				body = scanner.nextLine();
				int id = 1;
				
				System.out.println("== 입력된 내용 ==");
				System.out.println("번호 " + id);
				System.out.println("제목: " + title);
				System.out.println("내용: " + body);
				
				
			} else if (command.equals("article list")) {
				System.out.println("== 게시물 리스트==");
			} else if (command.equals("system exit")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("==존재하지 않는 명령어==");
			}
		}
		scanner.close();
	}
}