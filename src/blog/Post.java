package blog;

import java.util.Date;

public class Post {

    private String title;
    private String text;

    public Post(String title, String text, Category category, Date createdDate) {
        this.title = title;
        this.text = text;
        this.category = category;
        this.createdDate = createdDate;
    }

    private Category category;
    private Date createdDate = new Date();

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    public Post() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
