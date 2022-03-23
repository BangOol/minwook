package com.edu.api;


public class Id {

	public String getGender2(String sno) {
		String newSno = sno.replace("-","");
		newSno = newSno.replace(" ", "");
		String resule = null;
		
		return newSno;
	}
	
	
	
	
	public String getGender(String number) {
		char hypn;
		int a = number.indexOf("-");
		String str = null;
		
		
		if (a == 6) {
			hypn = number.charAt(7);
		} else {
			hypn = number.charAt(6);
		}

		
		
		switch (hypn) {
		case '1':
		case '3':
			str = "남자입니다.";
			break;

		case '2':
		case '4':
			str = "여자입니다.";
			break;

		}

		return str;
	}


}

//
//public String getGender(String sexNumber) {
//		
//		int index = sexNumber.indexOf("-");
// 		int str = null;
//		if (index == 6) {
//
//			int hypn = sexNumber.charAt(7);
//
//			if (hypn == 3 || hypn == 1) {
//				str = "남자입니다";
//			} else if (hypn == 2 || hypn == 4) {
//			str = "여자입니다";
//			}
//			
//		}
//
//		if (index != 6) {
//
//			int hypn = sexNumber.charAt(6);
//
//			if (hypn == 3 || hypn == 1) {
//				str = "남자입니다";
//			} else if (hypn == 2 || hypn == 4) {
//				str = "남자입니다";
//			}
//			
//		}
//	return str;

//}
//
//
