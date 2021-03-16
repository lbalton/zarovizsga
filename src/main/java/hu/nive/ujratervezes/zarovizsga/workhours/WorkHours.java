package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {

    public String minWork(String file) {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/hu/nive/ujratervezes/zarovizsga/workhours/" + file))) {

            StringBuilder sb = new StringBuilder();

            String line;
            int lessHour = 99;
            String name = null;
            String date = null;

            while ((line = bf.readLine()) != null) {

                String Parts[] = line.split(",");
                String names = Parts[0];
                int hour = Integer.parseInt(Parts[1]);

                if (hour < lessHour) {
                    lessHour = hour;
                    date = Parts[2];
                    name = names;
                }
            }
            sb.append(name + ":" + " " + date);

            return sb.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("cant read file" + ioe);
        }
    }

    public static void main(String[] args) {

        WorkHours workHours = new WorkHours();
        System.out.println(workHours.minWork("workhours.txt"));

    }
}