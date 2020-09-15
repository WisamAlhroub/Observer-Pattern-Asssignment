import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlogNotifier blogNotifier = new BlogNotifier();
        Moderator moderator = new Moderator(blogNotifier);
        ActivityTracker activityTracker = new ActivityTracker(blogNotifier);
        List<BlogPost> blogPosts = new ArrayList<BlogPost>();
        int input, noOfPosts = 0; String ans;
        Scanner scanner = new Scanner(System.in);
        String name, title, body;
        label:
        do{

            System.out.println("Welcome to this dummy blogpost container!" +
                    "\nDo you wanna add a blogpost? AnyInput/N:");
            ans = scanner.nextLine();

            if ("N".equals(ans)) {
                break label;
            }

            System.out.println("Enter your name, your blogpost title, and the body of that post. All within this format:" +
                    "\n**YOUR NAME**\n**TITLE**\n**BODY OF THE POST**");

            name = scanner.nextLine();
            title = scanner.nextLine();
            body = scanner.nextLine();

            blogPosts.add(new BlogPost(name, title, body, new Date()));
            blogNotifier.setState(++noOfPosts);


            System.out.println("Wanna continue? YES = Any Number/NO = 0: ");
            try{
                input = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Invalid input, try again!!\n\n");
                break;
            }

            ans = null;
        }while(input != 0);
    }
}
