package com.wavecheng.ISBNRunner.entity;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library {

	public static enum LibType{
		Huiwen,
		Ilas,
		InterLib,
		Other
	}
	
	@Id
	@GeneratedValue
	private int id;
	
	private LibType type;
	private String name;
	private String homePage;
	private String opacAddr;
	private String isbnQuery;
	private String parser;
	private Timestamp addedTime= Timestamp.from(Calendar.getInstance().toInstant());
	private boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LibType getType() {
		return type;
	}
	public void setType(LibType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public String getOpacAddr() {
		return opacAddr;
	}
	public void setOpacAddr(String opacAddr) {
		this.opacAddr = opacAddr;
	}
	public String getIsbnQuery() {
		return isbnQuery;
	}
	public void setIsbnQuery(String isbnQuery) {
		this.isbnQuery = isbnQuery;
	}
	public Timestamp getAddedTime() {
		return addedTime;
	}
	public void setAddedTime(Timestamp addedTime) {
		this.addedTime = addedTime;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}	
}
