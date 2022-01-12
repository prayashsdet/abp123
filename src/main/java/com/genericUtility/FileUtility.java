package com.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable 
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable 
	 */
	public String getJsonKeyValue(String jsonKey) throws Throwable {
		FileReader reader =new FileReader(IPathConstant.JSONPATH);
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObject = (JSONObject)object;
		String value = jsonObject.get(jsonKey).toString();
		return value;
	}
}
