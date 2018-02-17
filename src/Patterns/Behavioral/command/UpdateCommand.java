package Patterns.Behavioral.command;

public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void Execute() {
        database.update();
    }
}
