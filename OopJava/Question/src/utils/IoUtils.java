package utils;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.app.core.Book;

public class IoUtils {

	public static boolean storeCart(ArrayList<Book> books, String fileName) throws IOException {
		try (FileOutputStream fos = new FileOutputStream(fileName)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(books);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			System.out.println("Unable to generate bill");
			return false;
		}
	}

}
