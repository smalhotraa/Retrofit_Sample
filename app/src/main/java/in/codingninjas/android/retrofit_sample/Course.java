package in.codingninjas.android.retrofit_sample;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Course {

    private int id;
    private String title;

    @SerializedName("name")
    private String courseName;

    private String overview;

    public Course(int id, String title, String courseName, String overview) {
        this.id = id;
        this.title = title;
        this.courseName = courseName;
        this.overview = overview;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String toJson(){

        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
