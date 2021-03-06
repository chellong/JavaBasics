package com.example.testdynamic_javaCompiler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试脚本引擎执行javaScript
 * 
 * @author 北飞的候鸟
 *
 */

@SuppressWarnings("all")
public class TestJavaCompilerDemo03 {

	public static void main(String[] args) {

		try {
			// 获得脚本引擎对象
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine engine = sem.getEngineByName("javascript");
			// 定义变量，存储到引擎上下文
			engine.put("msg", "this is a goog code");
			String str = "var user = {name : 'man', age : 18,schools : ['xikeda','nankeda'] };";
			str += "print(user.name);";

			// 执行校本
			engine.eval(str);

			engine.eval("msg = 'sxt is a goog school' ;");

			System.out.println(engine.get("msg"));

			System.out.println("**************************************************");

			engine.eval("function add(a,b) { var sum = a + b ; return sum ; }");

			Invocable in = (Invocable) engine;
			Object result = in.invokeFunction("add", new Object[] { 13, 20 });
			System.out.println(result);

			System.out.println("**************************************************");
			// 导入其他java包，使用其他包中的java类
			// String jsCode = "import java.util.*; var
			// list=Arrays.asList([\"北京尚学堂\",\"清华大学\",\"北京大学\"]);";
			// engine.eval(jsCode);
			// List<String> list = (List<String>)engine.get("list");
			//
			//
			// for(String temp : list){
			// System.out.println(temp);
			// }
			System.out.println("**************************************************");

			//URL url = TestJavaCompilerDemo03.class.getClassLoader().getResource("a.js");
			//FileReader fr = new FileReader(url.getPath());
			///Jav-Basics/src/com/example/testdynamic_javaCompiler/a.js
			FileReader fr = new FileReader("src/com/example/testdynamic_javaCompiler/a.js");
			engine.eval(fr);
			fr.close();

		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
