package com.love.introduce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by xingzhu on 2016/11/15.
 */

public class MyAdapter extends SwipeCardAdapter<MyAdapter.MyHolder> {
    private Context mContext;

    public MyAdapter(Context context, List<String> list) {
        super(list);
        mContext = context;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.self, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
//        holder.setData((Person) mList.get(position));
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private TextView name,school,department,home,hobby;

        public MyHolder(View itemView) {
            super(itemView);
//            name = (TextView) itemView.findViewById(R.id.name);
//            school = (TextView) itemView.findViewById(R.id.school);
//            department = (TextView) itemView.findViewById(R.id.department);
//            home = (TextView) itemView.findViewById(R.id.home);
//            hobby = (TextView) itemView.findViewById(R.id.hobby);
        }

        public void setData(Person person) {
//            name.setText(person.name);
//            school.setText(person.school);
//            department.setText(person.department);
//            home.setText(person.home);
//            hobby.setText(person.hobby);
        }
    }
}