import java.util.Random;
public class UC2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int dice = ran.nextInt(6)+1;
        System.out.println("dice: "+dice);
    }
}