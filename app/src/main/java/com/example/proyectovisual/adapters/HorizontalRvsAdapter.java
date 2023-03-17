package com.example.proyectovisual.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectovisual.R;
import com.example.proyectovisual.SelectListner;
import com.example.proyectovisual.objects.HorizontalRvs;

import java.util.List;

public class HorizontalRvsAdapter extends RecyclerView.Adapter<HorizontalRvsAdapter.ViewHolder> {
    private List<HorizontalRvs> mData;
    private LayoutInflater mInflater;
    private Context context;


    public HorizontalRvsAdapter(List<HorizontalRvs> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @NonNull
    @Override
    public HorizontalRvsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.btn_rv,null);
        return new HorizontalRvsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalRvsAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bindData(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItems(List<HorizontalRvs> items){mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nom;
        CardView cardView;
        public RecyclerView recyclerView;
        public int recyclerid;

        ViewHolder(View itemView){
            super(itemView);
            nom = itemView.findViewById(R.id.curs);
            cardView = itemView.findViewById(R.id.cardView);
            recyclerView = itemView.findViewById(recyclerid);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerView.setVisibility(View.VISIBLE);
                    Toast.makeText(v.getContext(), "Recycler:" + recyclerid, Toast.LENGTH_SHORT).show();
                    Toast.makeText(v.getContext(), "My Item position: " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        void bindData(final HorizontalRvs item){
            nom.setText(item.getNom());
            recyclerid = item.getChild();

        }
    }
}
