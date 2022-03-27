package com.edu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {
	Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	class memberServiceImpl implements MemberService {

		public void addMember(Member member) {

			members.add(member);

		}

		@Override
		public void modifyMember(Member member) {
			
			for (int i = 0; i < members.size(); i++) {
				
				if (members.get(i).getMemberId() == member.getMemberId()) {
					System.out.println("전화번호를 다시 입력하세요.");
					String phoneNumber = scn.next();
					members.get(i).setPhone(phoneNumber);

				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
		}

		@Override
		public List<Member> memberList() {
			// for(Member i : members){
//			System.out.println(i); 를 통해 전체 리스트를 출력할 수 있지만
			// 현재 메소드의 상태는 리턴 값을 돌려줘야 하고, 내가 수정할 수 없는 상태라서 저 형태로 돌려줘야 함.
			return members;

		}
	}

	public void execute() {
		// 메유: 1.등록 2.수정 3.전체리스트 9.종료

		while (true) {
			System.out.println("메뉴: 1.등록 2.수정 3.전체리스트 9.종료");
			MemberService service = new memberServiceImpl();
			int menu = scn.nextInt();

			if (menu == 1) {
				try {
					System.out.println("학생번호를 입력하세요");
					int memberId = scn.nextInt();
					System.out.println("학생이름을 입력하세요");
					String memberName = scn.next();
					System.out.println("전화번호를 입력하세요");
					String memberPhone = scn.next();
					System.out.println("어느 반입니까?");
					System.out.println("축구반, 수영반, 도서반이 있습	1니다. 그 곳의 코치 이름을 입력해주세요.");
					String select = scn.next();
					System.out.println("등급을 입력하세요");
					String Grade = scn.next();
					
					Member classMember = new BookMember(memberId, memberName, memberPhone, select, Grade);
					service.addMember(classMember);
				} catch (InputMismatchException e) {
					e.printStackTrace();
					System.out.println("잘못 입력하셨습니다.");
				}
			} else if (menu == 2) {
				System.out.println("수정할 학생번호를 입력하세요");
				int stuId = scn.nextInt();
				Member sample = new Member(stuId,null,null);
				service.modifyMember(sample);
			} else if (menu == 3) {

				List<Member> member = service.memberList();
				for (Member s : member) {
					System.out.println(s.toString());
				}

			} else if (menu == 9) {
				break;
			}

		}

		System.out.println("end of program");
// 생성자, toString
	}
}
