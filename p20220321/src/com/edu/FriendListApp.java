package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10]; // friend 타입 클래스이기에 자식 클래스들이 자동형변환을 통해 배열에 저장이 가능하다

		Friend f1 = new Friend();
		f1.setName("홍길동");
		f1.setAge(15);
		f1.setHeight(173.2);
		f1.setWeight(57.5);
		f1.setPhone("010-8311-4811");

		UnivFriend f2 = new UnivFriend("서현일", 29, 178.3, 69.2, "010-4464-7479");
		f2.setMajor("컴퓨터공학과");
		f2.setUniversity("대구대");

		ComFriend f3 = new ComFriend("최규완", 29, 188.3, 79.2, "010-1114-7229", "naver", "mapApp developer");

		Friend f4 = new Friend();
		f4.setName("홍길동1");
		f4.setAge(15);
		f4.setHeight(143.2);
		f4.setWeight(57.5);
		f4.setPhone("010-8221-4811");

		UnivFriend f5 = new UnivFriend("서현일", 29, 178.3, 69.2, "010-1414-7479");
		f5.setMajor("컴퓨터공학과");
		f5.setUniversity("대구대");

		ComFriend f6 = new ComFriend("최규완", 29, 188.3, 79.2, "010-4444-7229", "daum", "mapApp developer");

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;

		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;
		// 부모와 자식 간 관계로 인해 가능해짐.

		// 학교친구만 출력
		// 회사친구만 출력
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i] instanceof UnivFriend) {
				System.out.println(friends[i].toString()); //// ++++++ 꼭 보기

			}
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println(friends[i].toString()); // 마지막 4번째 값이 null 값인데, toString을 호출해서 오류가 뜸
															// 동일한 기능이지만 인스턴스종류에 따른 결과 실행 --> 다형성
		}

		Friend friend = (Friend) f2; // 부모클래스는 자식클래스의 값을 담아줄수있다. getUniversity, getMajor가 정의되어 있는데, 부모클래스에할당되면서,
		// 부모클래스가 가지고 있는 것으로만 제한이 생긴다.
		friend = f1; //
		UnivFriend uni = (UnivFriend) friend; /////////////// +++++++++++++++++++
		uni = (UnivFriend) friend; // 강제형변환
		if (friend instanceof UnivFriend) // univ 클래스가 맞는지 확인? ///이건 자세히 공부해봐야 될듯 // uni 변수값이 Inivfriend의 인스턴스인지
			// casting 해야함.
			uni = (UnivFriend) friend; // 위의 조건이 있어야만 강제로 형변환이 가능함. 자세한건 몰루 if 사용하고 나서야 자식클래스에 부모클래스 넣을수 있는듯
		uni.getUniversity(); // 부모 클래스의 참조변수 타입은 자식클래스의 참조변수에 할당이 가능하다.

	}
}
