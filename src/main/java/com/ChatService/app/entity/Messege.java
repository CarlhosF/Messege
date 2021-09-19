package com.ChatService.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="messege")
public class Messege {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "autor",length = 30)
	String autor;
	@Column(name = "messg",length = 30)
	String messg;
	
	
	
	public Messege() {
		super();
	}



	public Messege(String autor, String messg) {
		super();
		this.autor = autor;
		this.messg = messg;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getMessg() {
		return messg;
	}



	public void setMessg(String messg) {
		this.messg = messg;
	}
	
	
}
