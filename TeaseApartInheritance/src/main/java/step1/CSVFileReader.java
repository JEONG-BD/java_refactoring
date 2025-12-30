package step1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {


    public CSVFileReader(String filename) throws IOException {
        super(new BufferedReader(new FileReader(filename)));
    }

    @Override
    public String[] readCSV() throws IOException {
        String line = _bufReader.readLine();
        if(line == null){
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override
    public void close() throws IOException {
        _bufReader.close();
    }
}
