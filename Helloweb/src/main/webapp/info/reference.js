// reference.js

const names = ['조수연', '황진주', '이유빈', '권가희'] // 자바스크립트에서는 배열을 쓰고자 할 때 기호를 꼭 넣어야함?

for(let i = 0; i<names.length; i++){
  console.log((i+1) + '번 째 이름: ' + names[i]);
}

//확장 for = enhanced for   <----> for(String name : names){}
for(let name of names){
  console.log(name);
}

const numbers = [23,44,38,12,56];
for (let num of numbers){
  console.log(num);
}


const inputs = []; // 배열 생성
for(let i =0; i<numbers.length; i++){
let inputVal = prompt('값을 입력하세요.'); // 입력을 하게 만들어주는 메소드(Scanner 같은 기능)
console.log(typeof inputVal, inputVal);
inputs[i] = parseInt(inputVal); // parseInt 로 inputVal의 값들을 정수화?

}

let sum=0, avg; //sum을 0, 즉 숫자라고 선언하지 않으면 문자로 인식해서 sum, avg 결과가 Nan NaN으로 나옴
for(let i =0; i<inputs.length; i++){
  sum += inputs[i];
}

avg = sum / inputs.length;
console.log(sum, avg);



// 합계, 평균


