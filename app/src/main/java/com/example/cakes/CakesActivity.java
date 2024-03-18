package com.example.cakes;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cakes.model.Cake;

import java.util.ArrayList;
import java.util.List;

public class CakesActivity extends AppCompatActivity{

    RecyclerView cakeRecycle;
    MyAdapter cakeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        List<Cake> cakeList = new ArrayList<>();
        cakeList.add(new Cake(1, "cake_1", 4.82));
        cakeList.add(new Cake(2, "cake_2", 4.22));

        setCakeRecycle(cakeList);
    }

    private void setCakeRecycle(List<Cake> cakeList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        cakeRecycle = findViewById(R.id.recyclerView);
        cakeRecycle.setLayoutManager(layoutManager);
        cakeAdapter = new MyAdapter(this, cakeList);
        cakeRecycle.setAdapter(cakeAdapter);
    }

}
