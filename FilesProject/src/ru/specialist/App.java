package ru.specialist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	// ../labs.txt
	public static final String FILENAME = ".."+File.separator+"test.txt";

	public static void main(String[] args) throws IOException, InterruptedException {
		try(var fis = new FileInputStream(".." + File.separator + "labs.txt");
			var isr = new InputStreamReader(fis, Charset.forName("utf-8"));	
			var reader = new BufferedReader(isr); )
		{
			
			String s;
			while ( (s = reader.readLine()) != null )
				System.out.println(s);
		} // reader.close(); isr.close(); fis.close();		
		
		//RandomAccessFile rnd = new RandomAccessFile("../labs.txt", "r");
		//rnd.seek(100)
		
		Path labs = Paths.get("..", "labs.txt");
		System.out.println(labs.getFileName());
		if (Files.exists(labs)) {
			//String content = Files.readString(labs, Charset.forName("utf-8"));
			//System.out.println(content);
			List<String> lines = Files.readAllLines(labs, Charset.forName("utf-8"));
			for(String line : lines)
				System.out.println(line);
		}
		
		Random rnd = new Random();
		try (var fos = new FileOutputStream("../test.txt");
			 var writer = new PrintWriter(fos);) {
			for(int i=0; i < 3; i++) {
				writer.printf("%d %d %d\n", rnd.nextInt(100), rnd.nextInt(10), rnd.nextInt() );
				writer.flush();
			}
		}
		
		Path fileToWrite = Paths.get("..", "test2.txt");
		String[] stringToWrite = { "Java Client-Server", "Java 1. Base", "Spring", "Java 2. OOP" };
		Files.write(fileToWrite, 
					List.of(stringToWrite),
					Charset.forName("utf-8"));
		
		
		Path dir = Paths.get("..");
		Files.newDirectoryStream(dir).forEach(System.out::println);
		
		WatchService watchDog = FileSystems.getDefault().newWatchService();
		
		dir.register(watchDog, StandardWatchEventKinds.ENTRY_CREATE);
		
		WatchKey key = watchDog.take();
		for( var event : key.pollEvents()) {
			System.out.println(event.context());
		}
		

	}

}
