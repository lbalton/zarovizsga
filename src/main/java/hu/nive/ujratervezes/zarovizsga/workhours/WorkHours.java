package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {

    public String minWork(String file) {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("src/main/resources/hu/nive/ujratervezes/zarovizsga/workhours/"+file))) {


            String line;
            while ((line = bf.readLine())  != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("cant read file" + ioe);
        }
        return null;
    }

        public static void main(String[] args) {

        WorkHours workHours = new WorkHours();
            System.out.println(workHours.minWork("workhours.txt"));

        }
    }
