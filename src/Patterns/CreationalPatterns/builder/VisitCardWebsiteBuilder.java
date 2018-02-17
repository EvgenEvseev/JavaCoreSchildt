package Patterns.CreationalPatterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
