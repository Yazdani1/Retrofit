package yazdaniscodelab.retrofityazdanifinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    private ImageView mFlowerPhoto;
    private TextView mFlowerName,mFlowerCategory,mFlowerInstruction,mFlowerProductId,mFlowerPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        addDetails();
        Intent intent=getIntent();
        Flower flower= (Flower) intent.getSerializableExtra(Constant.REFERENCE.FLOWER);

        mFlowerName.setText(flower.getName());
        mFlowerInstruction.setText(flower.getInstructions());
        mFlowerCategory.setText(flower.getCategory());
        mFlowerPrice.setText(String.format("$%.2f",flower.getPrice()));
        mFlowerProductId.setText(String.format("%d",flower.getProductId()));

        Picasso.with(getApplicationContext())
                .load("http://services.hanselandpetal.com/photos/"+flower.getPhoto())
                .into(mFlowerPhoto);


    }


    public void addDetails(){

        mFlowerPhoto=(ImageView)findViewById(R.id.flower_Details_photo_xml);
        mFlowerCategory=(TextView)findViewById(R.id.flowerDetails_Category_xml);
        mFlowerInstruction=(TextView)findViewById(R.id.flowerDetails_Instruction_xml);
        mFlowerPrice=(TextView)findViewById(R.id.flowerDetails_price_xml);
        mFlowerName=(TextView)findViewById(R.id.flowerDetails_Name_xml);
        mFlowerProductId=(TextView)findViewById(R.id.flowerDetails_productId_xml);

    }



}
