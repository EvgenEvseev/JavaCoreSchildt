package Patterns.StructuralPatterns.facade;

public class BugTracker {
    private boolean ActiveSprint;

    public boolean isActiveSprint() {
        return ActiveSprint;
    }

    public void startSprint(){
        System.out.println("Spring is active.");
        ActiveSprint=true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active.");
        ActiveSprint=false;
    }
}
