package com.sjp.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1번 게시물 저장소
		int article1__id = 0;
		String article1__title = "";
		String article1__body = "";
		
		//2번 게시물 저장소
		int article2__id = 0;
		String article2__title = "";
		String article2__body= "";
		
		int article3__id = 0;
		String article3__title = "";
		String article3__body = "";
		
		int lastArticleId = 0;
		
		while (true) {
			System.out.printf("명령어) ");
			String command = scanner.nextLine();
			
			if (command.equals("article list")) {
				System.out.println("==게시물 리스트==");
				
				if(lastArticleId == 0) {
					System.out.println("게시물이 없습니다");
					continue;
				}
				
				System.out.println("번호 / 제목");
				
				if (lastArticleId >= 1) {
					System.out.printf("%d / %s\n" , article1__id  , article1__body);
				}
				
				if (lastArticleId >= 2) {
					System.out.printf("%d / %s\n" , article2__id  , article2__body);
				}
				
				
				
			}
			
			
			else if (command.equals("article add")) {
				System.out.println("==게시물 등록==");
			
				int id = lastArticleId + 1;
				String title;
				String body;
				
				System.out.printf("제목) ");
				title = scanner.nextLine();
				System.out.printf("내용) ");
				body = scanner.nextLine();
				
				if (id == 1) {
					article1__id = id;
					article1__title=title;
					article1__body=body;
				}else if (id==2) {
					article2__id = id;
					article2__title=title;
					article2__body=body;
				}
				
				//System.out.printf("제목 : %s, 내용 : %s\n" , title, body);
				System.out.printf("%d번 게시물이 출력되었습니다.\n", id);
		
				// 가장 마지막 게시물 번호를 갱신한다.
				// 왜냐하면 방금 새 게시물이 생성되었으니까
				lastArticleId = id;
			}
			else if (command.equals("system exit")) {
				System.out.println("==시스템 종료==");
				break;
			}
		}
		
		scanner.close();
	}
}