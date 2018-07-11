package in.codingninjas.android.retrofit_sample;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CoursesApi {

    @GET("courses.json")
    Call<CourseResponse> getCourseResponse();

    @GET("/users")
    Call<List<User>> getUsers();

    @GET("users/{name}")
    Call<GithubUser> getGithubUser(@Path("name") String name);

    @GET("/comments")
    Call<ArrayList<Comments>> getComments(@Query("postId") Integer id);

    @POST("/posts")
    Call<Post> createPost(@Body Post post);
}
