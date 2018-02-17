package Patterns.CreationalPatterns.builder;

public class EnterpriseWebsiteBulder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
