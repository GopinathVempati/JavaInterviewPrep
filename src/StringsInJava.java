import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsInJava {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name : ");
//        String name = scanner.nextLine();
        /*String str = "afdf6???efv4??5dagfs???5";
        str = str.replaceAll("([a-z])", "");
        Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");//num???num
        Pattern patternP1 = Pattern.compile("([0-9])([?])([?])([0-9])");//num??num
        Pattern patternP2 = Pattern.compile("([0-9])([?])([0-9])");//num?num
        Matcher m1 = patternP1.matcher(str);
        Matcher m2 = patternP2.matcher(str);
        Matcher m3 = pattern.matcher(str);
        if (m1.find() || m2.find())
            System.out.println("false");
        if(m3.find())
            System.out.println("true");*/
      Stack<String> stack = new Stack<>();
      Queue<String> queue = new LinkedList<>();
      stack.push("apple");
      stack.push("banana");
      stack.push("cherry");
      queue.add(stack.pop());
      stack.push("dingelBerry");
      stack.push("eggelephnat");
      queue.add("fig");
      stack.push(queue.remove());
      queue.add(stack.pop());
      queue.add(stack.pop());
        System.out.println(stack);
        System.out.println(queue);
    }

}
