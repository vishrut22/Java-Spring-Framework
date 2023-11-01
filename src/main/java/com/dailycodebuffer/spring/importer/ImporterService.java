package com.dailycodebuffer.spring.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Now everything is business class
// Lets tell spring to create beans for us.
@Component
public class ImporterService {
    // DI - It means importer service is dependent on baseImporter
    // Which base importer to use that can be decided by spring Application

    private BaseImporter baseImporter;

    @Autowired
    public ImporterService(BaseImporter baseImporter) {
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing file using importer : "+ baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
