package com.wavecheng.ISBNRunner.entity;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author boch
 * Checking batch 
 */
@Entity
public class CheckBatch {

	@Id
	@GeneratedValue
	private int id;	
	private String name;
	private String isbn;
	private Timestamp addedTime = Timestamp.from(Calendar.getInstance().toInstant());
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Timestamp getAddedTime() {
		return addedTime;
	}
	public void setAddedTime(Timestamp addedTime) {
		this.addedTime = addedTime;
	}
	
}
