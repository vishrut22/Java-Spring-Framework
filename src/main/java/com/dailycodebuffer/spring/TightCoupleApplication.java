package com.dailycodebuffer.spring;

import com.dailycodebuffer.spring.importer.CSVImporter;
import com.dailycodebuffer.spring.importer.ImporterService;

public class TightCoupleApplication {
    public static void main(String[] args) {
        var csvImporter = new CSVImporter();
        // This is example of tight coupling where importer service is bounded to particular type of import.
        // Say we want to change csv importer to json importer, in this case it requires change in application to change importer service
        // create object of particular importer tool and pass.
        var importerService = new ImporterService(csvImporter);
        importerService.importAll();
    }
}
