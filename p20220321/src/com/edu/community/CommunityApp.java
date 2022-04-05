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
			System.out.println("메뉴: 1.게시글 목록  2.게시글 작성  3.게시글 수정  4.게시글 삭제 "
					+ " 5.회원가입  6.회원탈퇴  7.나의 글 확인하기  9.종료");

			int menu = scn.nextInt();

			// 0. 메뉴 기능
			
			// 1. 게시글 목록
			// 1-1. 현재 내용을 출력 (게시글 번호, 제목, 기입시간)
			
			// 2. 글 작성
			// 2-1. 아이디, 비밀번호 입력
			// 2-2. logIn method 사용 및 결과값 받아서 if 문 작성
			// 2-3. 제목, 내용 기입(아이디, 비밀번호 기입 시 생기는 토큰을 nextLine()으로 해결)
			// 2-4. register method 사용하여 기입한 내용 등록.
			
			// 3. 글 수정
			// 3-1. 수정을 하기 위한 아이디, 비밀번호 입력
			// 3-2. Community 객체를 생성 및 값을 받아 myCommunityList 구현 메소드 실행
			// 3-3. 메소드 실행 결과를 통해, 내가 작성한 글의 번호, 제목 확인
			// 3-4. 수정하고자 하는 번호 입력 후, 제목, 내용 수정
			// 3-5. modify method 실행
			// 3-6. 게시글 번호가 일치하는 컬럼의 값을 수정.
			
			// 4. 게시글 삭제
			// 4-1. 삭제를 하기 위한 아이디, 비밀번호 입력
			// 4-2. Community 객체를 생성 및 값을 받아 myCommunityList 구현 메소드 실행
			// 4-3. 메소드 실행 결과를 통해, 내가 작성한 글의 번호, 제목 확인
			// 4-4. 삭제하고 싶은 번호 입력 후 removeList method 실행
			
			// 5. 회원가입
			// 5-1. 회원가입을 위한 아이디, 비밀번호 입력
			// 5-2. checkAccount method 실행 및 겹치는 아이디 여부 확인
			// 5-3. 겹치지 않을 경우 makeAccount method 실행
			// 5-4. 게시글 번호가 primary key이기에, 게시글을 자동 생성할 수 있도록 설정.
			
			// 6. 회원탈퇴
			// 6-1. 탈퇴를 위한 아이디, 비밀번호 확인
			// 6-2. logIn method를 이용하여 계정이 존재하는지 확인.
			// 6-3. removeAccount method를 활용하여 아이디, 비밀번호가 겹치는 게시글 전체 삭제.
			
			// 7. 내 글 확인
			// 7-1. 아이디, 비밀번호 확인
			// 7-2. myCommunityList method를 실행하여 출력
			
			
			if (menu == 1) {
				List<Community> community = service.totalList();
				for (Community i : community) {
					System.out.println(i.toString());
					
				}
			} else if (menu == 2) { // 글 작성

				Community com = new Community();

				System.out.println("아이디를 입력해주세요.");
				String id = scn.next();
				com.setCommunityId(id);

				System.out.println("비밀번호를 입력해주세요.");
				String password = scn.next();
				com.setCommunityPassword(password);

				int r = service.logIn(com);
				if (r != 0) {
					System.out.println("로그인되었습니다.");
				} else if (r == 0) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}

				// java.sql.SQLIntegrityConstraintViolationException
				// java.util.InputMismatchException

				scn.nextLine();
				System.out.println("제목을 입력해주세요.");
				String name = scn.nextLine();
				com.setCommunityName(name);

				System.out.println("내용을 입력해주세요.");
				String contents = scn.nextLine();
				com.setCommunityContents(contents);

				service.register(com);

				// 해결

			} else if (menu == 3) { // 글 수정
				Community com = new Community();

				System.out.println("수정을 하기 전, 아이디와 비밀번호를 확인하겠습니다.");
				System.out.println("아이디를 입력하세요");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);

				List<Community> checkList = service.myCommunityList(com);

				for (Community i : checkList) {
					System.out.println(i.checkList());
				}

				System.out.println("수정하고자 하는 게시글 번호를 입력하세요.");
				int number = scn.nextInt();
				com.setCommunityCount(number);
				scn.nextLine();
				System.out.println("제목을 수정해주세요.");
				String name = scn.nextLine();
				com.setCommunityName(name);
				System.out.println("내용을 수정해주세요.");
				String contents = scn.nextLine();
				com.setCommunityContents(contents);
				service.modify(com);
				System.out.println("수정되었습니다.");

				// 해결

			} else if (menu == 4) { // 글 삭제
				Community com = new Community();
				System.out.println("삭제를 진행하도록 하겠습니다.");

				System.out.println("수정을 하기 전, 아이디와 비밀번호를 확인하겠습니다.");
				System.out.println("아이디를 입력하세요");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);

				List<Community> checkList = service.myCommunityList(com);

				for (Community i : checkList) {
					System.out.println(i.checkList());
				}

				System.out.println("삭제하고자 하는 게시글 번호를 입력하세요.");
				int number = scn.nextInt();
				com.setCommunityCount(number);

				service.removeList(com);

				// 해결

			} else if (menu == 5) { // 회원가입
				Community com = new Community();
				System.out.println("회원가입을 위해 아이디를 입력하세요.");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);

				int m = service.checkAccount(com);
				if (m != 0) {
					service.makeAccount(com);
				} else {
					continue;
				}
				// 해결

			} else if (menu == 6) { // 회원탈퇴
				Community com = new Community();
				System.out.println("회원탈퇴를 진행하도록 하겠습니다.");
				System.out.println("삭제하실 아이디를 입력하세요.");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);

				int r = service.logIn(com);
				if (r != 0) {
					System.out.println("확인되었습니다.");
				} else if (r == 0) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				service.removeAccount(com);

				// 해결

			} else if (menu == 7) { // 내 글 확인
				Community com = new Community();
				System.out.println("아이디를 입력하세요");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);

				List<Community> checkList = service.myCommunityList(com);

				for (Community i : checkList) {
					System.out.println(i.checkList());
				}
				// 해결
				
			} else if (menu == 9) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}

// 리스트 안 개수 세는 방법 처리 완료.
// primary key 게시글 수로 변경하여 같은 아이디, 비밀번호 안 되는 현상 해결 완료
// sql - order by community_count 이용하여 순차적으로 목록 출력 완료
// 시간 값 sql에서 자체 해결하도록 문구 수정 완료
// 제목 및 내용 입력 시 스페이스바를 사용할 때 다음 명령문이 입력처리되는 현상 수정 완료(nextLine 추가 삽입으로 버퍼 처리)
// primary key인 게시글 번호가 겹치지 않도록, 게시글 등록 메소드에서 해결함.