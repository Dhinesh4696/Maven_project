package com.File_Ex;

public class File_Reading {
	
	private File_Reading() {
		
	}
	
	public static File_Reading getInstanceFRM() {
		File_Reading frm = new File_Reading();
		return frm;
		
	}
	
	public Configure getInstanceCR() throws Throwable {
		Configure cr = new Configure();
		return cr;
		
	}

}
