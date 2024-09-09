// import './css/App.css'
// css 폴더에 App.css 가 있고, 연결할때 사용하는 코드 

import Button from "./Button";
function App() {
  // arr1을 복사해서 arr2를 만들고 싶어서 다음과 같이 했더니 원하는 결과가 나타나지 않음
  // arr1과 arr2가 공유
  var arr1 = [1,2,3];
  console.log(arr1);
  var arr2 = arr1;  
  console.log(arr2);
  arr2.push(4); //arr2에 4를 추가했더니 
  console.log(arr1); // arr1에 4가 같이 추가( 같이 추가됐다기 보다 하나를 공유했기 때문에 발생한 결과)
  console.log('-------------------');
  //arr3을 복사해서 arr4를 만들고 싶어서 전개 연산자를 사용했더니 원하는 결과가 나옴 
  var arr3 = [1,2,3];
  console.log(arr3);
  var arr4 = [...arr3]; // 전개연산자: 배열이나 객체를 복사할때 사용
  console.log(arr4);
  arr4.push(4);
  console.log(arr3);
 
  return (
    <div>
   <button>눌러주세요</button>
   <Button />
    </div>
    
  );
}

export default App;
