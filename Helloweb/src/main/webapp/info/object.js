//object.js

let member1 = { // member1이라는 변수 class와 비슷한 기능을 하는 듯. + 일종의 인스턴스 역할?
  fullName: 'Hong', age: 20, score: 80
};

let member2 = {
  fullName : 'Hwang', age: 22, score:88
};

let member3 = {
  fullName : 'park', age: 25, score:92
};

member1.fullName = '홍'; // 중간에 이렇게 변수의 값을 바꿀 수 있다.
console.log(member1.age + member2.age); // member라는 변수 안의 변수?를 꺼내고 싶을 때 자바처럼 . 을 이용하여 꺼낼 수 있다.
console.log(member1.fullName);
// Map --> {key, value}, {key, value}, .... 


//배열에다 member 값 넣어보기
const members = [member1, member2, member3];
// 홍의 나이는 20이고 점수는 80입니다. 같은 식으로 for를 돌려 각 멤버 값이 나오도록 하기

document.write('<ul>');
for(let i =0; i<members.length; i++){
  console.log(members[i].fullName + "의 나이는 " + members[i].age + "이고 점수는 " + members[i].score + "입니다." )

  document.write('<li>', members[i].fullName,', ',members[i].age,', ',members[i].score ,'</li>')
  //$를 이용하여 변수 값을 읽어올 수 있음.
  document.write('<li>, ${members[i].fullName}, $members[i].age, $members[i].score ,</li>') // 여기 오류 터지는 거 해결해보자.
}

document.write('</ul>');

let welcome = '안녕하세요. 반갑습니다'; // 이거 두 문장 띄우는 거 있는데, 설명 못들어서 따로 찾아봐야 됨
document.write('<h3>hong</h3>') // 매개값을 html 형식으로 출력? + 태그<> 까지 처리 가능.


