package com.dailycodebuffer.spring.importer;

public class ImporterService {
    private BaseImporter baseImporter;
    public ImporterService(BaseImporter baseImporter) {
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing file using importer : "+ baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
