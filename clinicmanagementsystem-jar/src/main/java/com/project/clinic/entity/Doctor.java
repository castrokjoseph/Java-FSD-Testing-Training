package com.project.clinic.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hiDoctor")
public class Doctor {
	@Id
	private String did;
	private String dfname, dlname;
	private int room;
	private String available;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDid() {
		return did;
	}


	public void setDid(String did) {
		this.did = did;
	}


	public String getDfname() {
		return dfname;
	}


	public void setDfname(String dfname) {
		this.dfname = dfname;
	}


	public String getDlname() {
		return dlname;
	}


	public void setDlname(String dlname) {
		this.dlname = dlname;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public String getAvailable() {
		return available;
	}


	public void setAvailable(String available) {
		this.available = available;
	}


	
	
	
}
