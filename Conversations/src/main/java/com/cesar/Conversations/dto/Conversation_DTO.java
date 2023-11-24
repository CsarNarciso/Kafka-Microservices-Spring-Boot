package com.cesar.Conversations.dto;

public class Conversation_DTO {

	private Long idSender;
	private String nameAddressee;
	
	
	public Conversation_DTO() {}
	
	public Conversation_DTO(Long idSender, String nameAddressee) {
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
