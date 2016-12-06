package org.json;

import java.io.StringWriter;

public class JsonEncodeDemo {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		StringWriter out = new StringWriter();
		obj.write(out);

		String jsonText = out.toString();
		System.out.print(jsonText);
		System.out.print(obj);
	}
}
