package com.wavecheng.ISBNRunner.service;

import com.wavecheng.ISBNRunner.entity.Library;

public interface ResultParser {
	
	boolean parse(Library lib);
}
