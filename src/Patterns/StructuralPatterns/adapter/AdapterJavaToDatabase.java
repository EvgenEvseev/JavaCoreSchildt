package Patterns.StructuralPatterns.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {

    @Override
    public void insert() {
        safeObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
