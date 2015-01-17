/**
 * 
 */

var firstName;
var lastName;
var getFullName;

var callFunc3 = function(){
	var CallMethod = Java.type('com.psk.nashorn.CallMethod');
	
	CallMethod.func3({
		foo: 'bar',
		foo: 'foo'
	});
}

function Person(firstName, lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.getFullName = function() {
		return this.firstName + " " + this.lastName;
	}
}

var callFunc4 = function () {
	var CallMethod = Java.type('com.psk.nashorn.CallMethod');
	
	var person1 = new Person("깜", "둥이");
	CallMethod.func4(person1);
}