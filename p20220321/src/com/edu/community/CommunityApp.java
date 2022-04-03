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
					// 게시글 번호 순으로 보고 싶음
					// toString 순서를 바꿔서 게시글 번호가 첫번째부터 보이고, 그 다음 제목이 보이면 좋겠음.
					// 15개씩 끊어서 ====== 이런식으로 치고, 깔끔하게 정리했으면 좋겠음.
				}
			} else if (menu == 2) {
				
				Community com = new Community();
				
				System.out.println("아이디를 입력해주세요.");
				String id = scn.next();
				com.setCommunityId(id);
				
				System.out.println("비밀번호를 입력해주세요.");
				String password = scn.next();
				com.setCommunityPassword(password);
				
				int r = service.logIn(com);
				if(r == 1) {
					System.out.println("로그인되었습니다.");
				} else if(r == 0){
					System.out.println("잘못 입력하셨습니다.");
					break; 
				}
			
				//java.sql.SQLIntegrityConstraintViolationException
				//java.util.InputMismatchException
				
				System.out.println("제목을 입력해주세요.");
				scn.next();
				String name = scn.nextLine();
				com.setCommunityName(name);
				System.out.println("엔터... 한번만 쳐줘요...");
				scn.nextLine();
				// nextLine, nextLine 이렇게 쓰니까, null이라고 인식됨.
				// nextLine, next 라고 쓰면, 제목은 null 값, 내용은 스페이스 이후 값으로 인식됨.
				//nextLine - next - nextLine 도 제목 값이 null로 나온다...
				// 야매... 에바야...
				System.out.println("내용을 입력해주세요.");
				String contents = scn.nextLine();
				com.setCommunityContents(contents);
				
				service.register(com);
				// 입력은 완벽하게 되나, 출력 시 제목이 모두 출력되지 않는 현상이 있음.
				// 내용은 입력이 다 되지만, 제목이 안됨.
				
				
			} else if (menu == 3) {
				Community com = new Community();
				
				System.out.println("수정을 하기 전, 아이디와 비밀번호를 확인하겠습니다.");
				System.out.println("아이디를 입력하세요");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);
				
				List<Community> checkList = service.myCommunityList(com);
				
				for(Community i : checkList) {
					System.out.println(i.checkList());
				}
				
				System.out.println("삭제하고자 하는 게시글 번호를 입력하세요. 한 번에 하나씩 됩니다.");
				int number = scn.nextInt();
				com.setCommunityCount(number);
				System.out.println("제목을 수정해주세요.");
				String name = scn.nextLine();
				com.setCommunityName(name);
				System.out.println("내용을 수정해주세요.");
				String contents = scn.nextLine();
				com.setCommunityContents(contents);
				//닉네임
				service.modify(com);
				System.out.println("수정되었습니다.");
				

			} else if (menu == 4) {
				System.out.println("삭제를 진행하도록 하겠습니다.");
				
				
			} else if (menu == 5) {
				Community com = new Community();
				System.out.println("회원가입을 위한 아이디를 입력하세요.");
				String id = scn.next();
				com.setCommunityId(id);
				System.out.println("비밀번호를 입력하세요");
				String password = scn.next();
				com.setCommunityPassword(password);
				
				int m = service.checkAccount(com);
				if(m != 0) {
					service.makeAccount(com);
				} else {
					break;
				}
				// 아이디가 중복될 때, 메뉴가 다시 실행되도록 하고싶음.
				
				
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