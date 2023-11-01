package com.dailycodebuffer.spring.importer;

public class CSVImporter implements  BaseImporter {
    public void importFile() {
        System.out.println("importing CSV file.");
    }
    public void getHeaders() {
        System.out.println("Providing list of headers present in CSV.");
    }
}
