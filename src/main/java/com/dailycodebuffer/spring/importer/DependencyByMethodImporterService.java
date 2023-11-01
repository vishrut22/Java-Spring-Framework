package com.dailycodebuffer.spring.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyByMethodImporterService {

    private BaseImporter baseImporter; // We are injecting using do wiring at setter method level and also notice we did similar thing for qualifier

    @Autowired
    @Qualifier("jsonImporter")
    public void setBaseImporter(BaseImporter baseImporter) {
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing file using importer : "+ baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
