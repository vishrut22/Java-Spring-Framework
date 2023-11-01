package com.dailycodebuffer.spring;

import com.dailycodebuffer.spring.importer.ImporterService;
import com.dailycodebuffer.spring.importer.SpringImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LooselyCoupledSpringApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringImportConfig.class);
        // so in this we are relying on configuration of application only
        // main call is not dependent on what importer is getting used they just need importer service
        // which help for import as per current applicaton.
        // the simpler part is spring is taking care of managing object.
        ImporterService importerService = context.getBean(ImporterService.class);
        importerService.importAll();
    }
}
