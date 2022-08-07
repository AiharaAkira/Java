package com.score;

import java.io.IOException;

public interface Score {

	public int insert() throws IOException;
	public int seatch() throws IOException;
	public int update() throws IOException;
	public int delete() throws IOException;
	public void writeAll() throws IOException;
	public void writeSort() throws IOException;
	
	
	
}
