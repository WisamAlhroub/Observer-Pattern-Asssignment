import java.util.Date;

public class BlogPost {
    private String name;
    private String title;
    private String body;
    private Date postDate;

    public BlogPost(String name, String title, String body, Date postDate) {
        this.name = name;
        this.title = title;
        this.body = body;
        this.postDate = postDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
