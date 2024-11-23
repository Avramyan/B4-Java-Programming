package day17_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        int num = 1;
        for (num = 3; num > -0; num--) {
            System.out.println(num);
            if(num == 1){
                System.out.println("start!");
            }else {
                System.out.println("ready");
            }
        }
    }
}