package com.viglet.shiohara.tool.impl;

import java.sql.Connection;
import java.util.Map;

public interface ShJDBCCustomImpl {

	public Map<String, Object> run(Connection connection, Map<String, Object> attributes);
}
