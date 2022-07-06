package utils;
import static utils.ValidationUtils.convertDate;
import static com.app.core.Category.*;
import java.util.HashMap;
import java.util.HashSet;
import com.app.core.Library;
public class CollectionUtils {
	
	//Store book details in a library in hashing based data structure : HashSet
	public static HashSet<Library> populateData() {
		HashSet<Library> library = new HashSet<>();
		try{
			library.add(new Library("Touch of Eternity",DRAMA,250,convertDate("1-12-2020"),"Durjoy Dutta",12));
			library.add(new Library("War and Peace",FICTION,50,convertDate("1-1-2012"),"Leo Tolstoy",20));
			library.add(new Library("World's best boyfriend",FICTION,150,convertDate("1-1-2015"),"Durjoy Dutta",23));
			library.add(new Library("Oh yes! I am Single",FICTION,250,convertDate("1-1-2021"),"Durjoy Dutta",42));
			library.add(new Library("Harry Potter",NON_FICTION,500,convertDate("1-1-2011"),"J.K Rowling",52));
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
