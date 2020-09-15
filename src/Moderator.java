public class Moderator extends IBLogObserver {
    public Moderator(BlogNotifier blogNotifier) {
        this.blogNotifier = blogNotifier;
        this.blogNotifier.attach(this);
    }

    @Override
    public void update() {
        System.out.println("New update!: Number of Blogposts is " + blogNotifier.getState());
    }
}
