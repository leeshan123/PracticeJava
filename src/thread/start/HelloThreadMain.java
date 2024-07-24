package thread.start;

public class HelloThreadMain {
    //ctrl+alt+shifg+l 줄정렬

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+": start() 호출 전");
        helloThread.start();
        System.out.println(Thread.currentThread().getName()+": start() 호출 후");

        System.out.println(Thread.currentThread().getName()+": main() end");
    }

}
