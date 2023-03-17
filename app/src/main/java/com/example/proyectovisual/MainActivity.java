package com.example.proyectovisual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.proyectovisual.adapters.HorizontalRvsAdapter;
import com.example.proyectovisual.adapters.HorizontalRvsDecoration;
import com.example.proyectovisual.objects.HorizontalRvs;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<HorizontalRvs> elements;
    HorizontalRvs horizontalRvs1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontalRvs1 = new HorizontalRvs("DAAA",R.id.recyclermoduls);
        init();
    }

    public void init(){
        RecyclerView rvCurs = recylcer(R.id.recyclercurs);

        RecyclerView rvModuls = recylcer(R.id.recyclermoduls);

        RecyclerView rvUfs = recylcer(R.id.recyclerufs);




    }

    public RecyclerView recylcer(int idRecycler){
        elements = new ArrayList<>();
        //se llenaria con lo que se obtenga de la api,
        //probablemente se tenga que añadir parametros
        //para saber como obtener los elementos a la array
        elements.add(horizontalRvs1);
        elements.add(new HorizontalRvs("DAM1",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAM2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW1",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        elements.add(new HorizontalRvs("DAW2",R.id.recyclermoduls));
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.recycler_view_spacing);
        HorizontalRvsDecoration decoration = new HorizontalRvsDecoration(spacingInPixels);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        HorizontalRvsAdapter horizontalRvsAdapter = new HorizontalRvsAdapter(elements,this);
        RecyclerView recyclerView = findViewById(idRecycler);
        recyclerView.addItemDecoration(decoration);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(horizontalRvsAdapter);

        return recyclerView;
    }


    //@Override
    //public void onItemClicked(HorizontalRvs horizontalRvs) {
    //    RecyclerView rvChild = findViewById(R.id.recyclercurs);
    //    rvChild.setVisibility(View.VISIBLE);
    //}
}