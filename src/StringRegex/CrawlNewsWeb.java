package StringRegex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlNewsWeb {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        Scanner scn = new Scanner(new InputStreamReader(url.openStream()));
        scn.useDelimiter("\\Z");
        String content = scn.next();
        scn.close();
        content = content.replace("//n+"," ");

    }
}
