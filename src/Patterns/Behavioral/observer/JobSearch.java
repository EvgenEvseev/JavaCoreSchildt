package Patterns.Behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobsite jobSite = new JavaDeveloperJobsite();

        jobSite.addVaccancy("First Java Position");
        jobSite.addVaccancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Eugene Suleimanov");
        Observer secondSubscriber = new Subscriber("Nikolaj Valuev");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVaccancy("Best Java Position");

        jobSite.removeVaccancy("First Java Position");
    }
}
