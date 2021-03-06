package com.edu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// 1. 중첩 클래스 사용
// 2. 컬렉션 사용
// 3. 예외처리 사용
public class MemberApp {
	Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<Member>();

	
	public MemberApp() {
		
		
	}
	
	
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

		@Override
		public void searchName(String name) {
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberName().equals(name)) {
					for (Member m : members) {
						System.out.println(m.toString());
					}
				}
			}
		}

		@Override
		public void saveToFile() {
			try {
				FileWriter fw = new FileWriter("Member.data");
				BufferedWriter bw = new BufferedWriter(fw);
				
			//어떻게 해야 멤버의 자식 클래스인 soccer, swim, book의 값을 온전히 담을 수 있을까?
				
				
				for(Member member : members) {
					bw.write(member.getMemberId() + "," + member.getMemberName() + "," + 
							member.getPhone());
				}
				bw.close();
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

	public void execute() {
		// 메유: 1.등록 2.수정 3.전체리스트 9.종료
		MemberService service = new memberServiceImpl();
		while (true) {
			System.out.println("메뉴: 1.등록 2.수정 3.전체리스트 4.회원찾기(이름) 9.종료");

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
					System.out.println("1. 축구반 2.수영반  3.도서반이 있습니다. 들어가고자 하는 반의 번호를 입력해주세요 ");
					int button = scn.nextInt();

					if (button == 1) {
						System.out.println("반의 코치 이름을 입력하세요");
						String select = scn.next();
						System.out.println("등급을 입력하세요");
						String Grade = scn.next();
						Member classMember = new SoccerMember(memberId, memberName, memberPhone, select, Grade);
						service.addMember(classMember);
//						service.addMember(new SwimMember(memberId, memberName, memberPhone, select, Grade)); 이렇게 해도 작동됨.

					} else if (button == 2) {
						System.out.println("반의 코치 이름을 입력하세요");
						String select = scn.next();
						System.out.println("등급을 입력하세요");
						String Grade = scn.next();
						Member classMember = new SwimMember(memberId, memberName, memberPhone, select, Grade);
						service.addMember(classMember);

					} else if (button == 3) {
						System.out.println("도서반장의 이름을 입력하세요");
						String select = scn.next();
						System.out.println("등급을 입력하세요");
						String Grade = scn.next();
						Member classMember = new BookMember(memberId, memberName, memberPhone, select, Grade);
						service.addMember(classMember);
					}

				} catch (InputMismatchException e) {
					System.out.println("잘못 입력하셨습니다.");
					e.printStackTrace();
				}

			} else if (menu == 2) {
				System.out.println("수정할 학생번호를 입력하세요");
				try {
				int stuId = scn.nextInt();
				Member sample = new Member(stuId, null, null);
				service.modifyMember(sample);
				} catch(InputMismatchException e) {
					e.printStackTrace();
					System.out.println("잘못 입력하셨습니다.");
				}
				
			} else if (menu == 3) {

				List<Member> member = service.memberList();
				for (Member s : member) {
					System.out.println(s.toString());
				}
			} else if (menu == 4) {
				System.out.println("찾고자 하는 회원의 이름을 검색하세요");
				String name = scn.next();
				service.searchName(name);

			} else if (menu == 9) {
				service.saveToFile();
				break;
			}

		}

		System.out.println("end of program");
// 생성자, toString
	}
}
