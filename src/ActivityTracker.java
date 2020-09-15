public class ActivityTracker extends IBLogObserver{
    public ActivityTracker(BlogNotifier blogNotifier) {
        this.blogNotifier = blogNotifier;
        this.blogNotifier.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Activity Tracker tracked a new update!: Number of Blogposts is: " +
                blogNotifier.getState());
    }
}
