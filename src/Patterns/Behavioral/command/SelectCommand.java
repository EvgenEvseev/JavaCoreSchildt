package Patterns.Behavioral.command;

public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void Execute() {
        database.select();
    }
}
