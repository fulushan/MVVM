package com.fulushan.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;

import com.fulushan.BR;
import com.fulushan.R;
import com.fulushan.adapter.BeanAdapter;
import com.fulushan.bean.ProductEntity;
import com.fulushan.bean.UserEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Author： fulushan
 * Created  on 2017/7/6
 * Emain:  fulushan@sina.cn
 */
public class ProductListActivity extends FragmentActivity {
    private ListView lv;
    private List<ProductEntity> productEntities;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        lv = ((ListView) findViewById(R.id.lv));
        initData();
    }

    private void initData() {
        productEntities = new ArrayList<>();
        productEntities.add(new ProductEntity("手机","shouji","https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3797592229,3840448992&fm=117&gp=0.jpg"));
        productEntities.add(new ProductEntity("电脑","diannao","https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3625142282,583054845&fm=117&gp=0.jpg"));
        productEntities.add(new ProductEntity("篮球","lanqiu","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=934857459,1314615037&fm=117&gp=0.jpg"));

        BeanAdapter<ProductEntity> adapter = new BeanAdapter<>(ProductListActivity.this,  productEntities, BR.product,R.layout.product_item_view);
        lv.setAdapter(adapter);
    }
}
