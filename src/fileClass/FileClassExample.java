package fileClass;

import java.io.File;

public class FileClassExample {

	public static void main(String[] args) {
		File file=new File ("D:\\Student");
		boolean isDiretoryExist = file.isDirectory();
		File newFile=new File("D:\\student\ramesh.txt");
		boolean isFileExists=newFile.isexists();
		
		}
		
		
				

	}


