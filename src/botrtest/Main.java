/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package botrtest;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.clevercloud.botrapi.BotrAPI;
import org.clevercloud.botrapi.models.Video;

/**
 *
 * @author bastien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         Properties properties = new Properties();
        properties.load(new FileReader("/etc/botrcreds.properties"));
        String key = properties.getProperty("key");
        String secret = properties.getProperty("secret");
        BotrAPI botr = new BotrAPI(key, secret);
        List<Video> videos = botr.getVideos();

        System.out.println(videos.get(0).getAuthor());
    }

}
