package com.dailycodebuffer.spring.importer;

public class ImporterService {
    private CSVImporter csvImporter;
    public ImporterService(CSVImporter csvImporter) {
        this.csvImporter = csvImporter;
    }

    public void importAll() {
        System.out.println("Importing file using importer : "+ csvImporter);
        csvImporter.getHeaders();
        csvImporter.importFile();
    }
}
