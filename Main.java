package com.example.listviewwithbutton3dots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Employee> Employee = new ArrayList<Employee>();
        Employee emp1 = new Employee("Ahmed",20,R.id.im_fulltime,"male");
        Employee.add(emp1);


        RecyclerView rv = (RecyclerView) findViewById(R.id.rec);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);

        final MyAdapter adapter = new MyAdapter(Employee,getApplicationContext());
        rv.setAdapter(adapter);





    }

    public void showPopup(View v) {
        PopupMenu popupMenu = new PopupMenu(v.getContext(),v, Gravity.END);
        popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delete:
                        Toast.makeText(Main.this,"clicked", Toast.LENGTH_SHORT).show();

                        break;
                }
                return true;
            }
        });
        popupMenu.show();

    }
}
