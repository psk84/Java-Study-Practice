package com.psk.nashorn;

import java.util.Arrays;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class CallMethod {

	public static String func1(String name){
		System.out.format("Hi there from Java, %s", name);
		return "greetings from Java";
	}
	
	/**
	 * func2는 func1과 동일하나 클래스 타입을 찍는 메서드여서 생략 
	 * 
	 */
	
	public static void func3(ScriptObjectMirror mirror){
		System.out.println(mirror.getClassName() + ": " + 
					Arrays.toString(mirror.getOwnKeys(true)));
	}
	
	public static void func4(ScriptObjectMirror person){
		System.out.println("Full Name is: " + person.callMember("getFullName"));
	}
}
