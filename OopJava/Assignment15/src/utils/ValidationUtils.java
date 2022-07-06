package utils;
import java.util.Arrays;
import com.app.core.Category;
import cust_exception.BookHandlingException;


public class ValidationUtils {
  public static Category convertCategory(String ctype) throws BookHandlingException {
    try {
      return Category.valueOf(ctype.toUpperCase());
    }
    catch (IllegalArgumentException ex) {
      StringBuilder message = new StringBuilder("Unknown categoty.\nAvailable types are ");
      message.append(Arrays.toString(Category.values()));
      throw new BookHandlingException(message.toString());
    }
  }
}
