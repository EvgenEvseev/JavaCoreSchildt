package Patterns.Behavioral.command;

public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void Execute() {
        database.delete();
    }
}
