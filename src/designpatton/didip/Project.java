package designpatton.didip;

import java.util.ArrayList;
import java.util.List;

interface Developer{
    void develop();
}

class BackendDeveloper1 implements Developer{
    public void writeJava(){
        System.out.println("자바가 좋아 22~");
    }

    @Override
    public void develop() {
        writeJava();
    }
}
class FrontEndDeveloper1 implements Developer{
    public void writeJavascript(){
        System.out.println("자바스크립트가 좋아 22~");
    }

    @Override
    public void develop() {
        writeJavascript();
    }
}
class Project{

    private final List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement(){
        developers.forEach(Developer::develop);
    }

    public static void main(String[] args) {
        List<Developer> dev = new ArrayList<>();
        dev.add(new BackendDeveloper1());
        dev.add(new FrontEndDeveloper1());
        Project a = new Project(dev);
        a.implement();
    }
}