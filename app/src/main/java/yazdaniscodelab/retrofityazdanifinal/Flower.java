package yazdaniscodelab.retrofityazdanifinal;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by Yazdani on 5/25/2017.
 */

public class Flower implements Serializable{

    @Expose
    private String name;

    @Expose
    private double price;

    @Expose
    private String category;

    @Expose
    private String instructions;

    @Expose
    private String photo;

    @Expose
    private int productId;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions){
        this.instructions=instructions;
    }

    public String getPhoto(){
        return photo;
    }

    public void setPhoto(String photo){
        this.photo=photo;
    }


    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }


}
