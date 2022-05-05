package com.prop;

import java.io.IOException;

public class File_read_manager {

	private File_read_manager () {
		
	}
	
	public static File_read_manager getinfrm() {

		File_read_manager frm= new File_read_manager();
		return frm;
	}
	
	public confu_read getincr() throws IOException {

		confu_read cr= new confu_read();
		
		return cr;
	}
	
}
