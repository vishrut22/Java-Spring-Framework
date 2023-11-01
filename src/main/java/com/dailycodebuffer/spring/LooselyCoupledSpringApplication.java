package com.dailycodebuffer.spring;

import com.dailycodebuffer.spring.importer.DependencyByFieldImporterService;
import com.dailycodebuffer.spring.importer.DependencyByMethodImporterService;
import com.dailycodebuffer.spring.importer.ImporterService;
import com.dailycodebuffer.spring.importer.SpringImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class LooselyCoupledSpringApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringImportConfig.class);
        System.out.println("Started application and init completed.");
        var importerService = context.getBean(ImporterService.class);
        importerService.importAll();

        var dependencyByFieldImporterService = context.getBean(DependencyByFieldImporterService.class);
        dependencyByFieldImporterService.importAll();

        var dependencyByMethodImporterService = context.getBean(DependencyByMethodImporterService.class);
        dependencyByMethodImporterService.importAll();

    }
}
