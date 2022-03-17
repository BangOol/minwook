package com.edu;

public class Student {
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수  <== 필드정의,

	private int studentNo; 
	private String studentName;
	private int korScore = -1; //임의로 초기값을 넣음
	private int endScore = -1;	//내가 만드는 모든 것들에 대해서 다 set, get을 설정할 필요는 없음.
	private int mathScore = -1; // 하지만 적어도 필드에 있어서는 필요하다고 봄. 다른 클래스에서 이러한 필드변수를 사용하기 위한 전제조건을 생성하는거라 생각하면 됨.
	
	// 각 클래스마다 사용하는 변수들이 있을 것이고 우리는 그러한 변수들이 모인 걸 보고 필드라고 칭한다.
	// 이러한 필드변수, 메소드 등이 다른 클래스에서사용되기 위해서 우리는 private, public, default 같은 것들을 앞에 지정하게 되는데,
	// 다른 글에도 적혀있듯 private 는 클래스내에서, default는 패키지 내에서, public은 프로젝트 파일 내에서 사용할 수 있도록 지정해 놓은 것이라 보면 된다.
	
	public int getSumScore() {
		if(this.korScore != -1 && this.endScore != -1 && this.mathScore != -1) {
			return this.korScore + this.endScore + this.mathScore;
		}
		
		return -1;
	}
	
	// 결국 클래스마다 필드변수와 메소드들이 존재하고, 이러한 것들이 상호작용하기 위해서 우리가 set, get이라는 이름을 붙여가며 다른 클래스에서 사용할 수 있도록
	// 메소드를 만들어두는 것이라 생각하면 될 듯하다. 
	
	
	
	public double getAvgScore() {			//메소드를 만들 
		return getSumScore() / 3.0; //위의 메소드를 응용하여 새로운 메소드를 만들어씀. 
	}
	
	
	
	//생성자 : 필드의 값을 초기화
	//생성자의 경우 클래스 이름이랑 동일하게 작성했을 시 메소드가 아닌 생성자라고 인식하게 된다.  ************
	//필드의 값을 내가 원하는 값으로 시작하고 싶을 때 작성?
	
	
	//get, set처럼 생성자도 만들수 있음 (constructor) + super 지워도 됨
	public Student(int studentNo, String studentName, int korScore, int endScore, int mathScore) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.korScore = korScore;
		this.endScore = endScore;
		this.mathScore = mathScore;
	}

	//public을 지워서 모든 인스턴스가 인식이 되지 않는 것은 아니고, 내가 사용하고자 하는 인스턴스 형식이 있을 것인데
	//그 안에 매개변수를 어떤 것을 사용하냐에 따라서 인식이 되기도 안되기도 한다는 것이다.
	//
	public Student() {  //생성자의 경우 
		this.studentNo = 1;
		this.studentName = "nobody";
		this.endScore = 0;
	}
	
	public Student(int studentNo, String studentName) { // 매개변수 순서도 그댜ㅐ로 기입해야함
		this.studentName = studentName;
		this.studentNo = studentNo;
		
		//생성자에서 지정한 필드변수 외의 것을 쓸 수도 있다.
		// 그건 u1.setKorScore 같은 것을 통해 사용할 수 있다.
	}
	
	public Student(int studentNo) {  // 이 생성자의 경우 매개변수로 학생번호를 입력? 하는 거
		this.studentNo = studentNo;
	}
	
	//영어, 수학, 국어 -> 값이 저장되면 평균...
	//영어, 국어, 수학 -> 합계점수...
	
	public void setStudentNo(int studentNo){ //원래 이 메소드의 역할은 다른 클래스에서 필드변수를 사용할 수 있게 하는 것이다.
										// 그런데 지금 적지 않은 경우네는 default 라고 하여 패키지 내에서 공유됨ㄴ다.
		this.studentNo = studentNo;   //studentNo라는 필드에 값을 지정해주는 기능을 생성함
	}
	
	public int getStudentNo(){
													// 위 필드의 studentNo를 반환시켜주겠다는 의미
		return this.studentNo;						// 저장되어있는 값을 반환시켜주는 기능을 생성함.
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) { //다른 패키지에서 메소드를 인식시키기 위해서는 public을 써야한다. 기억하자 꼭
		this.studentName = studentName;				//인식이 안된다? 다시 한번 살펴보자
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEndScore() {
		return endScore;
	}

	public void setEndScore(int endScore) {
		this.endScore = endScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public static void callStatic() {
		System.out.println("정적 메소드 실행");
	}
	
	public String getStudInfo() {
		String str = "====================================";
		str += "\n 이름: " + this.getStudentName() +  "이고 ";
		str += "\n 학번: " + this.getStudentNo() + "이고"; //String.format으로 수정가능?
		str += "\n 평균: " + String.format("%.2f",this.getAvgScore()) + " 입니다.";
		str += "\n ================================= ";
		
		// String 타입으로 반환하는게 없으면에러뜸 string 경우 + /n 써서 줄바꿈 씀
		return str; 								//get 써도 되고 그냥 studname 써도 됨
	}
	
	
	// 그렇다면 for(int i = 0; i <users.length; i++){
	// if( users[i].getSumInfo 같은 구문에서는 users[] 라는 배열 안에 들어있는 A, B, C의 내용을 불러올 수 있다는 얘기..
	// 그 말은 즉 다른 클래스에서 필드 변수 선언 -> 메소드를 통해 다른 클래스에서 값을 입력하고 출력받을 수 이쓴 메소드생성
	// -> 인스턴스를 통해서 값을 담음 -> 그 값들을 담아놓은 인스턴스들을 배열에 넣음 -> 그 배열을 통해서 값을 불러올 수 있음
	//
	
	//기능(method) ==> 규칙: 변환값, 메소드명, 매개변수{} (반환값이 없을 경우 void)
}
