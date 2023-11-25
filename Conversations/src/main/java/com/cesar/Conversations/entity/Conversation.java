package com.cesar.Conversations.entity;

public class Conversation {

	private Long idSender;
	private String nameAddressee;
	
	
	public Conversation() {}
	
	public Conversation(Long idSender, String nameAddressee) {
		this.idSender = idSender;
		this.nameAddressee = nameAddressee;
	}
	
	
	public Long getIdSender() {
		return idSender;
	}
	public void setIdSender(Long idSender) {
		this.idSender = idSender;
	}
	public String getNameAddressee() {
		return nameAddressee;
	}
	public void setNameAddressee(String nameAddressee) {
		this.nameAddressee = nameAddressee;
	}
}
