package utils;

import java.util.HashMap;

import com.app.core.Book;
import static java.time.LocalDate.*;
import static com.app.core.Category.*;

import custom_exception.BookShopHandlingException;

public class CollectionUtils {

	public static HashMap<String, Book> populateMap() throws BookShopHandlingException {

		HashMap<String, Book> bookMap = new HashMap<>();

		Book newBook = new Book("JAVA", "Rk sharma", valueOf("FULLSTACK"), 450.0, parse("2010-11-25"));
		bookMap.put("JAVA", newBook);

		newBook = new Book("JS", "vs delta", valueOf("MERNSTACK"), 400.0, parse("2012-10-02"));
		bookMap.put("JAVASCRIPT", newBook);

		newBook = new Book("REACTJS", "rahul ver", valueOf("MERNSTACK"), 500.0, parse("2018-04-02"));
		bookMap.put("REACTJS", newBook);

		newBook = new Book("NODEJS", "alfred ", valueOf("FULLSTACK"), 350.0, parse("2018-04-02"));
		bookMap.put("NODEJS", newBook);

		newBook = new Book("ANGULAR", "durga", valueOf("FRONTEND"), 400.0, parse("2020-07-23"));
		bookMap.put("ANGULAR", newBook);

		

		return bookMap;
	}

}
