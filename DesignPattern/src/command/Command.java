package command;

public abstract class Command {
    protected Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

    public String getResult() {
        return receiver.getContext();
    }
}

class DeletePageCommand extends Command {
    public DeletePageCommand() {
        this.receiver = new PageGroup();
    }

    public void execute() {
        receiver.delete();
    }
}

class AndRequireCommand extends Command {
    public AndRequireCommand() {
        this.receiver = new RequirementGroup();
    }

    public void execute() {
        receiver.add();
        receiver.save();
    }
}

class ChangeRequireCommand extends Command {
    public ChangeRequireCommand() {
        this.receiver = new RequirementGroup();
    }

    public void execute() {
        receiver.change();
        receiver.save();
    }
}