/**
 * 
 */

//자바 클래스는 자바스크립트에서 java.type 확장 API를 통해 참조 가능
var callFunc1 = function(){
	var CallMethod = Java.type('com.psk.nashorn.CallMethod');
	
	//자바스트립트 타입은 그에 맞는 자바 랩퍼클래스로 형변환이 된다.
	//jdk.nashorn.internal패키지에 있는 클래스들이 변환처리를 해주기때문에 개발자는 신경쓰지 않아도 된다.
	var result = CallMethod.func1('깜둥이');
	print(result);
}




