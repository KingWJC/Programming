package command;

public class Client {
    public static void main(String[] args) {
        Command command = new AndRequireCommand();
        //command.setReceiver(new RequirementGroup());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.excute();
        System.out.println(command.getResult());
    }
}
