package consoletests;

import java.io.IOException;

/**
 * Examples don't work in NetBeans' console
 * @author Svetoslav
 */
public class ConsoleTests {
    public static void main(String[] args) throws InterruptedException, IOException {
        ConsoleTests test = new ConsoleTests();
        
        for (int i = 0; i < 20; i++) {
            test.progressBar(i);
            Thread.sleep(1000);
        }
    }

    private void progressBar(int val) {
        System.out.print("\r[");
        for (int i = 0; i < 20; i++) {
            if(i < val){
                System.out.print("-");
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
    
    private void progressBar2(int val) throws IOException {
        for (int i = 0; i < 22; i++) {
            System.out.print("\b");
        }
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            if(i < val){
                System.out.print("-");
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
}
