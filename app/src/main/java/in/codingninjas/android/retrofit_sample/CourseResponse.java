package in.codingninjas.android.retrofit_sample;

import java.util.ArrayList;

public class CourseResponse {

    class Data{

        ArrayList<Course> courses;
    }

    String message;

    int status;

    Data data;
}
