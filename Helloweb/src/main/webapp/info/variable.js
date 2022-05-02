//variable.js

var myName='전민욱';
myName = 100; // number
myName = true; // boolean
myName = null; // object
var yourName; // undefined
console.log(typeof yourName);
// 어떠한 값이 들어가느냐에 따라 type이 다름. (null은 object)

var yourName = "홍길동";
// 이렇게 후에 선언한 경우, 변수 부분들을 따로 끌어올려 먼저 체크를 한다. 
// 자바스크립트의 경우 같은 변수를 2번 선언해도 오류가 나질 않는다. 다만 그 이외의 부분은 자바와 비슷함.
console.log(typeof yourName);

//전역변수(스크립스 안에 선언되어 있는 변수), 지역변수(함수 안에 선언되어 있는 변수)

function checkInfo(){
 var myName = 'JeonMinwook'; // 함수 안에서 새롭게 정의하면, 함수 안에서만 사용되고, 함수가 끝나면 사라짐(지역변수)
  console.log(myName);
}
checkInfo();
console.log(myName);// 전역변수

// ES6 (ES2015) --> let, const(상수선언하는 거)
// let 블럭레벨 변수선언.

function info(){
let myName = 'Hong'; // 중복선언 막기 위해 사용하는 거?
console.log(myName); // 단, 함수 내에서 사용했을 때는 다른 것으로 인식하는 듯.
}
// var와 let의 차이?
info();

{
  let myName = 'Hwang';
  console.log(myName); // 이렇게 블록 단위를 쓰게 되면, 안에 있는 변수는 사용되고 블럭이 끝날 때 사라지게 됨.
}

const otherName = 'Hong'; // 다시 값을 바꿀 수 없음.
otherName ='Hwang';

//var, let -> 변수 선언에 사용
//const -> 상수 선언에 사용.
