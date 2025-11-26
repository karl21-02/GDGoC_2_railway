package com.fino.gdgoc_2_railway.domain.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/api/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/api/images")
    public List<String> getImages() throws IOException {
        List<String> imageNames = new ArrayList<>();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:static/images/*");

        for (Resource resource : resources) {
            String filename = resource.getFilename();
            if (filename != null && isImageFile(filename)) {
                imageNames.add(filename);
            }
        }
        return imageNames;
    }

    private boolean isImageFile(String filename) {
        String lower = filename.toLowerCase();
        return lower.endsWith(".png") || lower.endsWith(".jpg") ||
               lower.endsWith(".jpeg") || lower.endsWith(".gif") || lower.endsWith(".webp");
    }
}
