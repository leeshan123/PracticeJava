package string.problemsolve;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int index = str.indexOf(ext);
        System.out.println(index);

       String fileName = str.substring(0,index);
       String extnName = str.substring(index);

        System.out.println(fileName);
        System.out.println(extnName);
    }
}
