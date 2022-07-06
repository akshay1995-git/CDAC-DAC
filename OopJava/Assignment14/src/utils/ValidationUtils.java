package utils;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import com.app.core.Category;
import cust_exception.BookHandlingException;
import static com.app.core.Library.sdf;

public class ValidationUtils {

  public static Date convertDate(String date) throws ParseException {
    return sdf.parse(date);
  }

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
