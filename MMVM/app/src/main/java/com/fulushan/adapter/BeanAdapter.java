package com.fulushan.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.fulushan.R;

import java.util.List;

/**
 * Author： fulushan
 * Created  on 2017/7/6
 * Emain:  fulushan@sina.cn
 */
public class BeanAdapter<T> extends BaseAdapter {


    private Context context;
    private LayoutInflater inflater;
    private int layoutId;
    private int variableId;
    private List<T> list;

    public BeanAdapter(Context context, List<T> list, int resId,int layoutId) {
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
        this.variableId = resId;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding dataBinding;
        if (convertView == null) {
            dataBinding = DataBindingUtil.inflate(inflater,layoutId, parent, false);
        }else{
            dataBinding = DataBindingUtil.getBinding(convertView);
        }
        dataBinding.setVariable(variableId, list.get(position));
        return dataBinding.getRoot();
    }
}
