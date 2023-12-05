package homeworks.hw11;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ImgLoader {


    public static void load(String url) throws java.io.IOException, URISyntaxException {
        Document document = Jsoup.connect(url).get();
        URI uri = new URI(url);
        Elements elements = document.select("img");

        List<String> imgUrls = new ArrayList<String>();

        for (int x =0; x < elements.size(); x++){
            imgUrls.add(uri.getHost()+elements.get(x).attr("src"));
        }

    }


}
