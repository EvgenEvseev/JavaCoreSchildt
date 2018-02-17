package Patterns.Behavioral.command;

public class Developer {
    Command incert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command incert, Command update, Command select, Command delete) {
        this.incert = incert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void incertRecord(){
        incert.Execute();
    }

    public void updateRecord(){
        update.Execute();
    }

    public void selectRecord(){
        select.Execute();
    }

    public void deleteRecord(){
        delete.Execute();
    }
}
