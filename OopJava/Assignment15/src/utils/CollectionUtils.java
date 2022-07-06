package utils;
import static com.app.core.Category.*;
import java.util.HashMap;
import java.util.HashSet;
import com.app.core.Library;
import static java.time.LocalDate.parse;
public interface CollectionUtils {
	
	//Store book details in a library in hashing based data structure : HashSet
	static HashSet<Library> populateData() {
		HashSet<Library> library = new HashSet<>();
		try{
			library.add(new Library("Touch of Eternity",DRAMA,500,parse("01-12-2020"),"Durjoy Dutta",12));
			library.add(new Library("War and Peace",FICTION,500,parse("11-01-2012"),"Leo Tolstoy",20));
			library.add(new Library("World's best boyfriend",FICTION,500,parse("21-01-2015"),"Durjoy Dutta",23));
			library.add(new Library("Oh yes! I am Single",FICTION,500,parse("06-06-2021"),"Durjoy Dutta",42));
			library.add(new Library("Harry Potter",NON_FICTION,500,parse("01-01-2011"),"J.K Rowling",52));
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("In Collection Unit's catch block");
			System.out.println(e);
		}
		return library;	
	}

	//Store book details in a library in hashing based data structure : HashMap
	public static HashMap<String, Library> populateHashMap(HashSet<Library> library){
		HashMap<String, Library> map = new HashMap<>();
		for(Library lib: library)
			System.out.println("Added in map: "+map.put(lib.getTitle(), lib));
		return map;
	}
}
