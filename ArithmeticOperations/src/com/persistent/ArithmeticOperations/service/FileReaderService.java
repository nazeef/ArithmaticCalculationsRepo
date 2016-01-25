package com.persistent.ArithmeticOperations.service;

// ---------file reading utility service----------------

public interface FileReaderService {

	public String readFile(String fileName);
	
	public String[] readFileLineByLine(String fileName);
	
	public String[] readFileLineByLine(String fileName,String delimiter);
	
}
