import java.util.Scanner;

public class Main {
    public static void yakRemove(String text){
        text = text.replaceAll("Yak", "");
        text = text.replaceAll("yak", "");
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        yakRemove(text);
    }
}