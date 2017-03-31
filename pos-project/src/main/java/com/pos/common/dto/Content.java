package com.pos.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Sample.Hsu on 2017/3/31.
 */
public class Content implements Serializable {

	private String location;

	private String id;

	private Long contentType;

	private String from;

	private Date createdTime;

	private List<String> to;

	private Long toType;

	private Map<String, String> contentMetadata;

	private String text;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getContentType() {
		return contentType;
	}

	public void setContentType(Long contentType) {
		this.contentType = contentType;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public Long getToType() {
		return toType;
	}

	public void setToType(Long toType) {
		this.toType = toType;
	}

	public Map<String, String> getContentMetadata() {
		return contentMetadata;
	}

	public void setContentMetadata(Map<String, String> contentMetadata) {
		this.contentMetadata = contentMetadata;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
