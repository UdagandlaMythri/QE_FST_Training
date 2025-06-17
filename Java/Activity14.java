package Activites;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {
	    public static void main(String[] args) throws IOException {
	        File inputFile=new File("src/main/resources/act14_Input.txt");
	        if(inputFile.createNewFile()) {
	        	System.out.println("File created successfully");
	        	FileUtils.writeStringToFile(inputFile,"some text in a file",Charset.defaultCharset());
	        }else {
	        	System.out.println("File already exists");
	        }
//	        read the data from the file
	        System.out.println("data in input file:"+FileUtils.readFileToString(inputFile,Charset.defaultCharset()));
//	        copy the file to a new directory
	        FileUtils.copyDirectory(inputFile,new File("target/destDir"));
	        
//	        read the file from the new destination
	        File copiedFile=FileUtils.getFile("target/destDir/act14_Input.txt");
	        System.out.println("Data in the coped file:"+FileUtils.readFileToString(copiedFile,Charset.defaultCharset()));
	    }
	}


