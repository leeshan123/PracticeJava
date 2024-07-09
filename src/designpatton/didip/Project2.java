package designpatton.didip;


class BackendDeveloper{
    public void writeJava(){
        System.out.println("자바가 좋아 인터네셔널~");
    }
}
class FrontEndDeveloper{
    public void writeJavascript(){
        System.out.println("자바스크립트가 좋아 인터네셔널~");
    }
}
class Project2{
    private final BackendDeveloper backendDeveloper;
    private final FrontEndDeveloper frontEndDeveloper;

    public Project2(BackendDeveloper backendDeveloper, FrontEndDeveloper frontEndDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontEndDeveloper = frontEndDeveloper;
    }

    public void implement(){
        backendDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

    public static void main(String[] args) {
        Project2 a = new Project2(new BackendDeveloper(), new FrontEndDeveloper());
        a.implement();
    }
}