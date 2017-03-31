package com.pos.common.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sample.Hsu on 2017/3/31.
 */
public class Result implements Serializable {

	private Long from;

	private Long fromChannel;

	private List<String> to;

	private Long toChannel;

	private String eventType;

	private String id;

	private Content content;


	public Long getFrom() {
		return from;
	}

	public void setFrom(Long from) {
		this.from = from;
	}

	public Long getFromChannel() {
		return fromChannel;
	}

	public void setFromChannel(Long fromChannel) {
		this.fromChannel = fromChannel;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public Long getToChannel() {
		return toChannel;
	}

	public void setToChannel(Long toChannel) {
		this.toChannel = toChannel;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
}
