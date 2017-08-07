package yazdaniscodelab.retrofityazdanifinal;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Yazdani on 5/25/2017.
 */

public class RestManager {

    private FlowerServices mFlowerService;

    public FlowerServices getmFlowerService(){

        if (mFlowerService==null){

            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(Constant.HTTP.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mFlowerService=retrofit.create(FlowerServices.class);

        }

        return mFlowerService;
    }



}
