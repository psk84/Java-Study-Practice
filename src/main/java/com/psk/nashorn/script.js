/**
 * 
 */

var func1 = function(name){
	print('Hi there from Javascript, ' + name);
	return 'greeting from Javascript';
}

var func2 = function(object) {
	print("JS Class Definition: " + Object.prototype.toString.call(object))
}