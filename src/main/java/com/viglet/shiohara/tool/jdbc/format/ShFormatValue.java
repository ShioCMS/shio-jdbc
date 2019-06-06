package com.viglet.shiohara.tool.jdbc.format;

import com.viglet.shiohara.tool.jdbc.JDBCImportTool;
import com.viglet.shiohara.util.HtmlManipulator;

public class ShFormatValue {
	JDBCImportTool jdbcImportTool = null;
	public ShFormatValue(JDBCImportTool jdbcImportTool) {
		this.jdbcImportTool = jdbcImportTool;
	}
	public String format(String name, String value) {
		String[] strHTMLFields = jdbcImportTool.htmlField.toLowerCase().split(",");
		for (String strHTMLField : strHTMLFields) {
			if (name.toLowerCase().equals(strHTMLField.toLowerCase())) {
				if (name.toLowerCase().equals("id")) {
					this.idField(HtmlManipulator.html2Text(value));

				} else {
					return HtmlManipulator.html2Text(value);
				}
			}
		}
		if (name.toLowerCase().equals("id")) {
			return this.idField(value);
		} else {
			return value;
		}
	}

	public String idField(int idValue) {
		if (jdbcImportTool.typeInId) {
			return jdbcImportTool.type + idValue;
		} else {
			return Integer.toString(idValue);
		}
	}

	public String idField(String idValue) {
		if (jdbcImportTool.typeInId) {
			return jdbcImportTool.type + idValue;
		} else {
			return idValue;
		}
	}

}
