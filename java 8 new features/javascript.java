package java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByMimeType("nashorn");
		String script=" var name='youssef hribach';name;";
		try {
			 engine.eval("print('Hello, World!');");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
