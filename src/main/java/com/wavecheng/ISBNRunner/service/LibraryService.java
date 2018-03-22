package com.wavecheng.ISBNRunner.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wavecheng.ISBNRunner.entity.Library;

@Service
public interface LibraryService {
	
	Library add(Library lib);
	Library update(Library lib);
	List<Library> getActiveLibs();
}
