package com.dailycodebuffer.spring.importer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringImportConfig {
    @Bean
    public BaseImporter importer() {
        return new CSVImporter();
    }

    @Bean
    public BaseImporter jsonImporter() {
        return new JSONImporter();
    }

    @Bean
    @Primary
    public ImporterService importerService() {
        return new ImporterService(importer());
    }

    @Bean
    public ImporterService jsonImporterService(@Qualifier("jsonImporter") BaseImporter importer) {
        return new ImporterService(importer);
    }

}
