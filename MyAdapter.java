package com.example.listviewwithbutton3dots;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by best tech on 7/27/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Employee> employees;
    int Layout;
    Context context;


    public MyAdapter(List<Employee> employees, Context context) {
        this.employees = employees;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listview, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final Employee employee = employees.get(position);
        if(employee!= null){
            ((MyViewHolder)holder).im.setImageResource(employee.getImageId());
            ((MyViewHolder)holder).tVname.setText(employee.getName());
            ((MyViewHolder)holder).tvAge.setText(employee.getAge()+"");
            ((MyViewHolder)holder).tvGen.setText(employee.getGender());

        }

    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView tVname;
        TextView tvAge;
        TextView tvGen;

        public MyViewHolder(View itemView) {
            super(itemView);
            im = (ImageView) itemView.findViewById(R.id.im_fulltime);
            tVname = (TextView) itemView.findViewById(R.id.textnamefull);
            tvAge = (TextView) itemView.findViewById(R.id.textagefull);
            tvGen = (TextView) itemView.findViewById(R.id.textgenfull);

        }
    }
}
