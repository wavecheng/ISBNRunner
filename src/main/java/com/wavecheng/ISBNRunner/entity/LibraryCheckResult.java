package com.wavecheng.ISBNRunner.entity;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class LibraryCheckResult {

	@Id
	@GeneratedValue
	private int id;
	private int libId;
	private int batchId;
	private String isbn;
	private boolean found;
	private boolean success;
	private Timestamp updateTime = Timestamp.from(Calendar.getInstance().toInstant());
	
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isFound() {
		return found;
	}
	public void setFound(boolean found) {
		this.found = found;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
