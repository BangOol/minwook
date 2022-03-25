package com.edu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {
	static Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	class memberServiceImpl implements MemberService {

		public void addMember(Member member) {
			try {
				System.out.println("학생번호를 입력하세요");
				int memberId = scn.nextInt();
				System.out.println("학생이름을 입력하세요");
				String memberName = scn.next();
				System.out.println("전화번호를 입력하세요");
				String memberPhone = scn.next();
				System.out.println("어느 반입니까?");
				System.out.println("축구반, 수영반, 도서반이 있습니다.");
				String select = scn.next();
				System.out.println("등급을 입력하세요");
				String Grade = scn.next();
				
				if (select.equals("축구반")) {
					SoccerMember classMember = new SoccerMember(memberId, memberName, memberPhone, "호갈두", Grade);
					members.add(classMember);
				} else if (select.equals("수영반")) {
					SwimMember classMember = new SwimMember(memberId, memberName, memberPhone, "홍길동", Grade);
					members.add(classMember);
				} else if (select.equals("도서반")) {
					BookMember classMember = new BookMember(memberId, memberName, memberPhone, "호길동", Grade);
					members.add(classMember);
				} else {
					System.out.println("다시 입력해주세요");
					
				}
				
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
			

		}

		@Override
		public void modifyMember(Member member) {
			System.out.println("수정할 학생번호를 입력하세요");
			int stuId = scn.nextInt();
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == stuId) {
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
				Member member = new Member();
				service.addMember(member);

			} else if (menu == 2) {
				service.modifyMember(null);
			} else if (menu == 3) {
				service.memberList();
			} else if (menu == 9) {
				break;
			}

		}

		System.out.println("end of program");

	}
}
