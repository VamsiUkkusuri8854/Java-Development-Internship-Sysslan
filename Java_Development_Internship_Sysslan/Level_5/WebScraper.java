package Level_5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraper {

    public static void main(String[] args) {

        try {

            String website = "https://example.com";

            Document doc = Jsoup.connect(website).get();

            System.out.println("Website Title:");
            System.out.println(doc.title());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}