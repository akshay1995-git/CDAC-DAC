package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.app.core.Volunteer;

public interface IOUtils {

	 static void storeData(String fileName, ArrayList<Volunteer> list) throws IOException{
			try(PrintWriter pw=new PrintWriter(new FileWriter(fileName))){
				list.forEach(pw::println);
			}
		}
}
