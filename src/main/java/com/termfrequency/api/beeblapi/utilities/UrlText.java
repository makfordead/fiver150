package com.termfrequency.api.beeblapi.utilities;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlText {




        public void getText(String url)
        {
            try {
                System.out.println(extractTextFromUrl(url));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    private String extractTextFromUrl(String url) throws IOException {
        Connection.Response auth = Jsoup.connect(url)
                .method(Connection.Method.GET).execute();
        Document document = auth.parse();
        return document.body().text();
    }

}
