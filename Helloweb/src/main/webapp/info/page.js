// page.js
console.log(member1); 
// 비록 따로 선언은 하지 않았지만, html에 그 자바 스크립트가 존재하고 선언되어있기 때문에, object.js에서 그 값들을 들고 오게 된다.


let field ='fullName';
console.log(member1.fullName);
console.log(member2['fullName']); // 얘가 좀 더 좋음. 
console.log(member3[field]); // 변수에 fullName을 담아, String 값으로 담아둘 수 있다. 이게 좋다는데 기억해야지 뭐...



// 배열요소를 반복적으로 읽어올 때, for...of를 사용하자.
// ' 가 아니라 ~ 위치의 ` 사용해야 함.(외곽 부분) + 변수에는 ''사용
for(let member of members){
  console.log(`이름은 ${member['fullName']} 이고 나이는 ${member['age']} 점수는 ${member['score']}`);
}

// 오브젝트의 속성(필드)를 반복적으로 for...in
for(let field in member1){ // 이 field는 밖에 선언되어 있는 field와는 다른 친구. 끝나면 사라질 애임.
  console.log(`${field} => ${member1[field]}`)
}


//각 배열요소의 각 필드 출력
document.write('<table border = 1px>'); // 테두리 1px 지정
let fields=['score','fullName','age'];
for(let member of members){
  document.write(`<tr>`);
  // for(let field in member){
  //   console.log(`${field} => ${member[field]}`);// for .. in의 경우 field의 개수만큼 반복하는 것.
  // } // for in의 경우, fields에서 순서를 바꿀 때, 그에 맞추어 적절한 값을 출력하기 힘들다.

     for(let prop of fields){
       console.log(`${prop} => ${member[prop]}`) //member의 첫번째 요소를 넣는것? prop가 fields에서 값을 받아 member[]안에 대입되는 것?
       document.write();
       document.write(`<td>${member[prop]}</td>`);
     } // 순서를 바꾸어도 그 값에 맞추어 출력이 된다.

     document.write(`<td><button>클릭</button></td>`);
     document.write(`</tr>`);
  console.log('----------------------------------------');
}

document.write('</table>');