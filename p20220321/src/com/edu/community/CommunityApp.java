package com.edu.community;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommunityApp {
	
	List<Community> community = new ArrayList<Community>();
	Scanner scn = new Scanner(System.in);
	
	
	
	

	public void execute() {
		CommunityService service = new CommunityOracle();
		
		

		while (true) {
			System.out.println("메뉴: 1.게시글 목록  2.게시글 작성  3.게시글 수정  4.게시글 삭제 5.회원가입 9.종료");
			int menu = scn.nextInt();
			
			if (menu == 1) {
				List<Community> community = service.totalList();
				for(Community i : community) {
					System.out.println(i.toString());
				}
			} else if (menu == 2) {
				Community com = new Community();
				
				System.out.println("아이디를 입력해주세요.");
				String id = scn.next();
				com.setCommunityId(id);
				
				System.out.println("비밀번호를 입력해주세요.");
				String password = scn.next();
				com.setCommunityPassword(password);
				
//				service.logIn(com);
				//java.sql.SQLIntegrityConstraintViolationException
				//java.util.InputMismatchException
				
				System.out.println("제목을 입력해주세요.");
				String name = scn.next();
				com.setCommunityName(name);
				System.out.println("내용을 입력해주세요.");
				String contents = scn.nextLine();
				com.setCommunityContents(contents);
				
				// 시간 출력: 년월일 까지는 출력되나 시간과 분은 출력되지 않는다.
				// 컬렉션 안의 개수를 게시글 번호로 출력하고자 하였으나, 0으로 출력됨.
				// String 타입에서 엔터를 입력했을 때, 뒤의 부분에서 오류가 뜬다.
				// 아이디, 비밀번호가 같으면 오류가 뜸.
				service.register(com);
				
				
				
			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
