package com.dailycodebuffer.spring.importer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringImportConfig {
    @Bean
    public BaseImporter importer() {
        return new CSVImporter();
    }

    @Bean
    public ImporterService importerService() {
        return new ImporterService(importer());
    }
}
