package com.edu.community;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CommunityApp {

	List<Community> community = new ArrayList<Community>();
	Scanner scn = new Scanner(System.in);

	public void execute() { // admin, admin
		CommunityService service = new CommunityOracle();

		while (true) {

			System.out.println("1. 로그인 2. 회원가입 3.회원탈퇴 4.메뉴 종료");
			int mm = scn.nextInt();

			if (mm == 1) {
				Community comm = new Community();
				List<Community> checkList = service.myCommunityList(comm);

				System.out.println("아이디를 입력해주세요.");
				String loginId = scn.next();
				comm.setCommunityId(loginId);

				System.out.println("비밀번호를 입력해주세요.");
				String loginPassword = scn.next();
				comm.setCommunityPassword(loginPassword);

				int rr = service.logIn(comm);
				if (rr != 0) {
					System.out.println("로그인되었습니다.");

					while (true) {
						System.out.println("==========================================================================================");
						System.out.println("메뉴: 1.게시글 목록  2.게시글 작성  3.게시글 수정  4.게시글 삭제 " + " 5.나의 글 확인하기 6.비밀번호 변경 9.로그아웃");
						
						int menu = scn.nextInt();

						if (menu == 1) { // 글 목록 + 글 내용 확인
							List<Community> community = service.totalList();

							for (Community i : community) {
								System.out.println(i.toString());
							}
							
								System.out.println("보고 싶은 제목의 번호를 입력하세요.");
								int mini = scn.nextInt();
								comm = service.seeTheList(mini);
								System.out.println(comm.seeList());
							

						} else if (menu == 2) { // 글 작성

							// java.sql.SQLIntegrityConstraintViolationException
							// java.util.InputMismatchException
							scn.nextLine();
							System.out.println("제목을 입력해주세요.");
							String name = scn.nextLine();
							comm.setCommunityName(name);

							System.out.println("내용을 입력해주세요.");
							String contents = scn.nextLine();
							comm.setCommunityContents(contents);

							service.register(comm);

							// 해결

						} else if (menu == 3) { // 글 수정

							checkList = service.myCommunityList(comm);

							for (Community i : checkList) {
								System.out.println(i.checkList());
							}

							System.out.println("수정하고자 하는 게시글 번호를 입력하세요.");
							try {
							int number = scn.nextInt();
							comm.setCommunityCount(number);
							scn.nextLine();
							System.out.println("제목을 수정해주세요.");
							String name = scn.nextLine();
							comm.setCommunityName(name);
							System.out.println("내용을 수정해주세요.");
							String contents = scn.nextLine();
							comm.setCommunityContents(contents);
							service.modify(comm);
							} catch(InputMismatchException e) {
								e.printStackTrace();
								System.out.println("잘못 입력하셨습니다. 메뉴로 돌아갑니다.");
								scn.nextLine();
								continue;
							}
							// 해결

						} else if (menu == 4) { // 글 삭제
							checkList = service.myCommunityList(comm);
							for (Community i : checkList) {
								System.out.println(i.checkList());
							}

							System.out.println("삭제하고자 하는 게시글 번호를 입력하세요.");
							try {
							int number = scn.nextInt();
							comm.setCommunityCount(number);

							service.removeList(comm);
							} catch(InputMismatchException e) {
								System.out.println("잘못 입력하셨습니다. 화면으로 돌아갑니다.");
								scn.nextLine();
								continue;
							}
							// 해결

						} else if (menu == 5) { // 내 글 확인
							checkList = service.myCommunityList(comm);
							for (Community i : checkList) {
								System.out.println(i.checkList());
								
								
								// ++ 번호를 입력하여 내 글 내용 확인
							}
							// 해결

						} else if (menu == 6) { // 비밀번호 변경
							System.out.println("본인 확인을 위해 아이디를 확인하겠습니다.");
							String id = scn.next();
							comm.setCommunityId(id);
							Community chCom = service.changePW(comm);
							
							System.out.println("바꾸시고 싶은 비밀번호를 입력하세요");
							String pw1 = scn.next();
							System.out.println("한번 더 입력해주세요.");
							String pw2 = scn.next();
							
							if(pw1.equals(pw2)) {
								chCom.setCommunityPassword(pw1);
								service.changePassword(chCom);
							} else {
								System.out.println("잘못 입력하셨습니다.");
								continue;
							}
							
						} else if (menu == 9) {
							System.out.println("로그아웃합니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
							continue;
						}
					}

				} else if (rr == 0) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}

			} else if (mm == 2) { // 회원가입
				Community com = new Community();
				System.out.println("회원가입을 진행합니다. 아이디를 입력하세요.");
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
			} else if (mm == 3) { // 회원탈퇴
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

			}else if (mm == 4) {
				System.out.println("메뉴를 종료합니다.");
				break;
				
			}else if (mm == 951123) { // 관리자 계정 실행
				System.out.println("관리자 계정을 입력해주세요.");
				Community comm = new Community();
				List<Community> checkList = service.myCommunityList(comm);

				System.out.println("아이디를 입력해주세요.");
				String loginId = scn.next();
				comm.setCommunityId(loginId);
				

				System.out.println("비밀번호를 입력해주세요.");
				String loginPassword = scn.next();
				comm.setCommunityPassword(loginPassword);

				int rr = service.logInAdmin(comm);
				if (rr != 0) {
					System.out.println("로그인되었습니다.");
					
					while(true) {
						System.out.println("=============================================================================");
						System.out.println("메뉴: 1.게시글 목록  2.게시글 작성  3.게시글 수정  4.게시글 삭제 5.유저 계정목록 9.로그아웃");
						
						int Amenu = scn.nextInt();
						
						if(Amenu == 1) {
							List<Community> community = service.totalList();

							for (Community i : community) {
								System.out.println(i.toString());
							}
							System.out.println("리스트 내용을 확인하시겠습니까? (Y/N)");
							String YN = scn.next();
							
							if(YN.equals("Y")) {
								System.out.println("보고 싶은 제목의 번호를 입력하세요.");
								int mini = scn.nextInt();
								comm = service.seeTheList(mini);
								System.out.println(comm.seeList());
							} else if(YN.equals("N")) {
								System.out.println("메뉴로 돌아갑니다.");
								continue;
							} else {
								System.out.println("잘못 입력하셨습니다.");
								continue;
							}
						} else if(Amenu == 2) { // 관리자 글 작성
							scn.nextLine();
							System.out.println("제목을 입력해주세요.");
							String name = scn.nextLine();
							comm.setCommunityName(name);

							System.out.println("내용을 입력해주세요.");
							String contents = scn.nextLine();
							comm.setCommunityContents(contents);

							service.register(comm);
							
						} else if(Amenu == 3) { // 관리자 글 수정

							System.out.println("수정하고자 하는 게시글 번호를 입력하세요.");
							try {
							int number = scn.nextInt();
							comm.setCommunityCount(number);
							scn.nextLine();
							System.out.println("제목을 수정해주세요.");
							String name = scn.nextLine();
							comm.setCommunityName(name);
							System.out.println("내용을 수정해주세요.");
							String contents = scn.nextLine();
							comm.setCommunityContents(contents);
							service.modifyAdmin(comm);
							} catch(InputMismatchException e) {
								e.printStackTrace();
								System.out.println("잘못 입력하셨습니다. 메뉴로 돌아갑니다.");
								scn.nextLine();
								continue;
							}
							
						} else if(Amenu == 4) { // 관리자 삭제
							checkList = service.myCommunityList(comm);
							
							for (Community i : checkList) {
								System.out.println(i.checkList());
							}
							
							
							
							
							System.out.println("삭제하고자 하는 게시글 번호를 입력하세요.");
							
							int number = scn.nextInt();
							comm.setCommunityCount(number);
							
							service.removeListAdmin(comm);
							
						} else if(Amenu == 5) { //관리자 권한 유저 계정 파악
							List<Community> community = service.searchAccount();

							for (Community i : community) {
								System.out.println(i.AccountList());
							}
							
						} else if(Amenu == 9) { // 관리자 로그아웃
							System.out.println("로그아웃합니다.");
							break;
						} else {
							System.out.println("잘못 입력했습니다.");
							continue;
						}
					}
					
					
				} else if( rr == 0) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
			} else {
				System.out.println("잘못 입력하셨습니다. 처음부터 다시 시작해주세요.");
			}

		}
	}

}

// 수정, 삭제를 내가 아니더라고 모두가 가능함. 이ㅑㅇ...

