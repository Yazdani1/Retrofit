package yazdaniscodelab.retrofityazdanifinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements FlowerAdapter.FlowerClickListener{

    private RecyclerView recyclerView;
    private FlowerAdapter flowerAdapter;
    private RestManager restManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        additemhere();

        restManager=new RestManager();

        Call<List<Flower>>listCall=restManager.getmFlowerService().getallFlower();

        listCall.enqueue(new Callback<List<Flower>>() {
            @Override
            public void onResponse(Call<List<Flower>> call, Response<List<Flower>> response) {

                if (response.isSuccessful()){
                    List<Flower>flowerList=response.body();
                    for (int i=0;i<flowerList.size();i++){
                        Flower flower=flowerList.get(i);
                        flowerAdapter.addFlower(flower);
                    }

                }
            }

            @Override
            public void onFailure(Call<List<Flower>> call, Throwable t) {

            }
        });


    }

    public void additemhere(){

        recyclerView=(RecyclerView)findViewById(R.id.recycler_xml);
        recyclerView.setHasFixedSize(true);
        flowerAdapter=new FlowerAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(flowerAdapter);
    }

    @Override
    public void onClick(int position) {

        Flower selectflower=flowerAdapter.getallFlower(position);
        Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra(Constant.REFERENCE.FLOWER,selectflower);
        startActivity(intent);

    }
}
