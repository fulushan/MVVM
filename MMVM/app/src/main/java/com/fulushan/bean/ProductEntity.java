package com.fulushan.bean;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.fulushan.BR;
import com.squareup.picasso.Picasso;

/**
 * Author： fulushan
 * Created  on 2017/7/6
 * Emain:  fulushan@sina.cn
 */
public class ProductEntity extends BaseObservable {
    private String productName;
    private String pic;
    private String desc;

    public ProductEntity(String productName, String desc,String pic) {
        this.productName = productName;
        this.pic = pic;
        this.desc = desc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        notifyPropertyChanged(BR.product);
   }

    public ProductEntity() {
    }


    @BindingAdapter("bind:pic")
    public static void getUserAvator(ImageView iv, String pic) {
        Picasso.with(iv.getContext()).load(pic).into(iv);
    }

    public void onItemClick(View view) {

    }
}
