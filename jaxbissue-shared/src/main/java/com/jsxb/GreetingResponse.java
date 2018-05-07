package com.jsxb;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@SuppressWarnings("serial")
@XmlRootElement(name="GreetingResponse")
@XmlAccessorType(value=javax.xml.bind.annotation.XmlAccessType.FIELD)
public class GreetingResponse implements Serializable {

	@XmlAttribute()
	private String greeting;

	@XmlAttribute()
	private String serverInfo;

	@XmlAttribute()
	private String userAgent;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getServerInfo() {
		return serverInfo;
	}

	public void setServerInfo(String serverInfo) {
		this.serverInfo = serverInfo;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}