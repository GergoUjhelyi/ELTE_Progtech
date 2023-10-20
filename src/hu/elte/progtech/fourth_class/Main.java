package hu.elte.progtech.fourth_class;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataStore dataStore = new DataStore();
        dataStore.readFileWithBufferedReader(System.getProperty("user.dir") + File.separator + "test1.txt");
        dataStore.report();
        dataStore.clear();
    }
}
