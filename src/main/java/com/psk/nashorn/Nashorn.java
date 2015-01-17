package com.psk.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	/**
	 * 기본 샘플 메서드
	 * nashorn스크립트 엔진을 생성하여 자바스크립트 구문 실행
	 * 
	 */
	public static void printSample(){
		System.out.println("===================== Nashorn 기본 출력 메서드 ===========================");
		//javax.engine을 사용하여 nashorn 스크립트 엔진 생성
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval("print('Hello World');");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 자바스크립트 함수 호출 메서드
	 */
	public static void callFunction1(){
		System.out.println("===================== Nashorn Javascript 함수 호출1 메서드 ===========================");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval(new FileReader("/Users/psk84/seungkyu/workspace/Java-Study-Practice/src/main/java/com/psk/nashorn/script.js"));
			
			//자바스크립트를 호출하기 위해서 생성한 스크립트엔진을 Invocable로 형변환 해준다.
			Invocable invocable = (Invocable)engine;
			
			
			Object result = invocable.invokeFunction("func1", "깜둥이");
			System.out.println(result);
			System.out.println(result.getClass());
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 자바스크립트 펑
	 */
	public static void callFunction2(){
		System.out.println("===================== Nashorn Javascript 함수 호출2 메서드 ===========================");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval(new FileReader("/Users/psk84/seungkyu/workspace/Java-Study-Practice/src/main/java/com/psk/nashorn/script.js"));
			
			//자바스크립트를 호출하기 위해서 생성한 스크립트엔진을 Invocable로 형변환 해준다.
			Invocable invocable = (Invocable)engine;
			
			invocable.invokeFunction("func2", new Date());
			invocable.invokeFunction("func2", LocalDateTime.now());
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 자바스크립트에서 자바메서드 호출 메서드
	 */
	public static void calljavaMethodJavascript(){
		System.out.println("===================== Nashorn Javascript에서 Java 메서드 호출 메서드 ===========================");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval(new FileReader("/Users/psk84/seungkyu/workspace/Java-Study-Practice/src/main/java/com/psk/nashorn/javaMethodCallscript.js"));
			
			//자바스크립트를 호출하기 위해서 생성한 스크립트엔진을 Invocable로 형변환 해준다.
			Invocable invocable = (Invocable)engine;
			
			Object result = invocable.invokeFunction("callFunc1", "깜둥이");
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Mirror 기본 호출 메서드
	 */
	public static void callMirror1(){
		System.out.println("===================== Nashorn Javascript에서 Java 메서드 Mirror변환 기본 호출 메서드 ===========================");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval(new FileReader("/Users/psk84/seungkyu/workspace/Java-Study-Practice/src/main/java/com/psk/nashorn/mirrorscript.js"));
			
			//자바스크립트를 호출하기 위해서 생성한 스크립트엔진을 Invocable로 형변환 해준다.
			Invocable invocable = (Invocable)engine;
			
			invocable.invokeFunction("callFunc3");
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 자바스크립트에서 생성한 Person Object를 전달받아 처리하는 메서드 호출 메서드
	 */
	public static void callMirror2(){
		System.out.println("===================== Nashorn Javascript에서 Java 메서드 Mirror변환 Person Object 호출 메서드 ===========================");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			//문자열에 코드를 작성한다. 또는 미리 작성된 자바스크립트 파일을 reader하여 실행 
			engine.eval(new FileReader("/Users/psk84/seungkyu/workspace/Java-Study-Practice/src/main/java/com/psk/nashorn/mirrorscript.js"));
			
			//자바스크립트를 호출하기 위해서 생성한 스크립트엔진을 Invocable로 형변환 해준다.
			Invocable invocable = (Invocable)engine;
			
			invocable.invokeFunction("callFunc4");
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
