package com.viglet.shiohara.tool.ext;

import java.sql.Connection;
import java.util.Map;

import com.viglet.shiohara.tool.impl.ShJDBCCustomImpl;

public class ShJDBCCustomSample implements ShJDBCCustomImpl {
	final static String TITLE = "title";
	
	@Override
	public Map<String, Object> run(Connection connection, Map<String, Object> attributes) {
	
		if (attributes.containsKey(TITLE))
			attributes.replace(TITLE, String.format("Sample: %s", attributes.get(TITLE)));

		return attributes;
	}

}
