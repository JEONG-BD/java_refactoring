package step1;

import before.CSVReader;

import java.io.IOException;

public abstract class CSVPrinter {
    protected final CSVReader _csvReader;

    protected CSVPrinter(CSVReader csvReader) {
        this._csvReader = csvReader;
    }

    public abstract String[] readCSV()throws IOException;
    public abstract void print() throws IOException;
}
