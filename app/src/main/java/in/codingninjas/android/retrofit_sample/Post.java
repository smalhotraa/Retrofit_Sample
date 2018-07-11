package in.codingninjas.android.retrofit_sample;


//jsonplaceholder sample class
// https://jsonplaceholder.typicode.com/
public class Post {

    String title,body;
    int userId;

    public Post(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
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


}
