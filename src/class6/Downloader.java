package class6;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Downloader {
    public static void main(String[] args) {


                String videoUrl ="https://rfatutors.talentlms.com/file/video/id:8004,unit_id:9024";

                try (BufferedInputStream in = new BufferedInputStream(new URL(videoUrl).openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream( "/home/jannat-mugdho/gitHubProjects/batches/Batch14/javaBatch14/src/class1/video1.MP4")) {
                    byte dataBuffer[] = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }

                    System.out.println("Video download Complete :: " );
                } catch (IOException e) {
                    e.printStackTrace();
                }


    }
}
