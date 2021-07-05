package command;

public abstract class Receiver {
    protected String context = "";

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void save();

    public String getContext() {
        return context;
    }
}

class RequirementGroup extends Receiver {
    @Override
    public void add() {
        context += "增加新需求...";
    }

    @Override
    public void delete() {
        context += "删除需求...";
    }

    @Override
    public void change() {
        context += "修改需求...";
    }

    @Override
    public void save() {
        context += "\n保存需求...";
    }

}

class PageGroup extends Receiver {
    @Override
    public void add() {
        context += "增加新页面...";
    }

    @Override
    public void delete() {
        context += "删除页面...";
    }

    @Override
    public void change() {
        context += "修改页面...";
    }

    @Override
    public void save() {
        context += "\n保存页面...";
    }
}