//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int j=0; j<5; j++) {
            for (int i = 22500 + (j * 100); i < 25000 + (j * 100); i++) {
                String key = "key" + j;

                System.out.println(key);

            }
        }

    }
}