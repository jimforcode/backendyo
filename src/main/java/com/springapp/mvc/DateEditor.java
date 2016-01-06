package com.springapp.mvc;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) {
		if (StringUtils.isEmpty(text)) {
			setValue(null);
		} else {
			Long time = Long.valueOf(text);
			Date date = new Date(time);
			setValue(date);
		}
	}
}
