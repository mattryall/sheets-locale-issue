import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    String[] locales = { "en-US", "en-GB", "en-AU" };
    System.out.println("default: " + Arrays.toString(new DateFormatSymbols().getShortMonths()));
    for (String localeId : locales) {
      Locale l = Locale.forLanguageTag(localeId);
      DateFormatSymbols symbols = new DateFormatSymbols(l);
      System.out.println(localeId + ": " + Arrays.toString(symbols.getShortMonths()));
    }
  }
}

