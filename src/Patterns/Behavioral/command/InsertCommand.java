package Patterns.Behavioral.command;

public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void Execute() {
        database.insert();
    }
}
