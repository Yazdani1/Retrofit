package yazdaniscodelab.retrofityazdanifinal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Yazdani on 5/25/2017.
 */

public interface FlowerServices {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getallFlower();

}
