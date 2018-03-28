package com.wavecheng.ISBNRunner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavecheng.ISBNRunner.entity.Library;
import com.wavecheng.ISBNRunner.repository.LibraryRepository;
import com.wavecheng.ISBNRunner.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	@Override
	public Library add(Library lib) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Library update(Library lib) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Library> getActiveLibs() {
		// TODO Auto-generated method stub
		return null;
	}

}
