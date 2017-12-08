package edu.cnm.deepdive.androidhelloworld;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StudentService {

    @GET("students")
    Call<JsonWrapper<Student>> listStudents();

}
