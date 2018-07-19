package in.codingninjas.android.retrofit_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String key = "63c643047f96b93c103905a07a6a0992";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The Movie db check

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoursesApi coursesApi = retrofit.create(CoursesApi.class);

        Call<MovieResponse> call = coursesApi.getMovies("popular",key);

        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                MovieResponse movieResponse = response.body();

                if(movieResponse != null){

                    ArrayList<Movie> movies = movieResponse.results;

                    for(Movie movie : movies){

                        Log.d("lalala"," id = " + movie.id);
                    }

                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {

                Log.d("lalala",t.getMessage());
            }
        });





//        POST retrofit hit

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CoursesApi coursesApi = retrofit.create(CoursesApi.class);
//
//        final Post post = new Post("abcd","lk",1);
//
//        Call<Post> call = coursesApi.createPost(post);
//
//        call.enqueue(new Callback<Post>() {
//            @Override
//            public void onResponse(Call<Post> call, Response<Post> response) {
//
//                Post post1 = response.body();
//
//                Log.d("lalala",post1.title);
//                Log.d("lalala",post1.body);
//                Log.d("lalala",post1.userId + " ");
//            }
//
//            @Override
//            public void onFailure(Call<Post> call, Throwable t) {
//                Log.d("lalala",t.getMessage());
//            }
//        });

//      Query retrofit hit

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CoursesApi coursesApi = retrofit.create(CoursesApi.class);
//
//        Call<ArrayList<Comments>> call = coursesApi.getComments(1);
//
//        call.enqueue(new Callback<ArrayList<Comments>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Comments>> call, Response<ArrayList<Comments>> response) {
//
//                ArrayList<Comments> comments = response.body();
//
//                for(Comments comments1 : comments){
//
//                    Log.d("lalala",comments1.name);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Comments>> call, Throwable t) {
//
//                Log.d("lalala",t.getMessage());
//
//            }
//        });



//        Path parameter retrofit hit

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.github.com/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CoursesApi coursesApi = retrofit.create(CoursesApi.class);
//
//        Call<GithubUser> call = coursesApi.getGithubUser("smalhotraa");
//
//        call.enqueue(new Callback<GithubUser>() {
//            @Override
//            public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
//
//                GithubUser user = response.body();
//                Log.d("lalala",user.getName());
//                Log.d("lalala",user.getHtmlUrl());
//            }
//
//            @Override
//            public void onFailure(Call<GithubUser> call, Throwable t) {
//
//            }
//        });




// Basic Retrofit hit

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CoursesApi coursesApi = retrofit.create(CoursesApi.class);
//
//        Call<List<User>> call = coursesApi.getUsers();
//
//        call.enqueue(new Callback<List<User>>() {
//            @Override
//            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
//
//                ArrayList<User> users = new ArrayList<>();
//                users.addAll(response.body());
//
//                for(User u : users){
//
//                    Log.d("lalala",u.name);
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<List<User>> call, Throwable t) {
//                Log.d("lalala",t.getMessage());
//
//            }
//        });

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://codingninjas.in/api/v2/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CoursesApi coursesApi = retrofit.create(CoursesApi.class);
//
//        Call<CourseResponse> call = coursesApi.getCourseResponse();
//
//        call.enqueue(new Callback<CourseResponse>() {
//            @Override
//            public void onResponse(Call<CourseResponse> call, Response<CourseResponse> response) {
//                CourseResponse courseResponse = response.body();
//
//                ArrayList<Course> courses = courseResponse.data.courses;
//                if(courses != null){
//
//                    for(Course c : courses){
//
//                        Log.d("checkkkk",c.getCourseName());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<CourseResponse> call, Throwable t) {
//
//                Log.d("checkkkk",t.getMessage());
//
//            }
//        });
    }
}
