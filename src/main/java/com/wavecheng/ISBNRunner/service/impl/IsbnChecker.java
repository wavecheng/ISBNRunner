package com.wavecheng.ISBNRunner.service.impl;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.wavecheng.ISBNRunner.entity.CheckBatch;
import com.wavecheng.ISBNRunner.entity.Library;

public class IsbnChecker implements Runnable {

	private Library lib;
	private CheckBatch checkBatch;
	private List<String> isbnList;
	private HttpClient http = HttpClientBuilder.create().build();
	
	public IsbnChecker(Library lib, CheckBatch checkBatch) {
		this.lib = lib;
		this.checkBatch = checkBatch;
	}
	
	@Override
	public void run() {
		
	}

}
