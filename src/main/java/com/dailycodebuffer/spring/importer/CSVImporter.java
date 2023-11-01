package com.dailycodebuffer.spring.importer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CSVImporter implements  BaseImporter {
    public void importFile() {
        System.out.println("importing CSV file.");
    }
    public void getHeaders() {
        System.out.println("Providing list of headers present in CSV.");
    }
}
