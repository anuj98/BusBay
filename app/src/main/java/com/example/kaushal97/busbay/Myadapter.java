package com.example.kaushal97.busbay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaushal97 on 26/3/18.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.myViewHolder>{
    private int mNumberItems;
    public int[]imagesArray;
    String[] numberOfItems;
    public Myadapter(String[] numberOfItems,int[] imagesArray){
        mNumberItems=numberOfItems.length;
        this.numberOfItems=numberOfItems;
        this.imagesArray=imagesArray;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        int layoutIdForListItem= R.layout.list_item;
        LayoutInflater inflater=LayoutInflater.from(context);
        boolean shouldAttachTopParentImmediately=false;
        View view=inflater.inflate(layoutIdForListItem,parent,shouldAttachTopParentImmediately);
        myViewHolder viewHolder=new myViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(Myadapter.myViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }
    class myViewHolder extends RecyclerView.ViewHolder{
        TextView nmView,fromView,toView,timeView;
        ImageView imView;
        public myViewHolder(View itemView){
            super(itemView);

            nmView=(TextView)itemView.findViewById(R.id.number_);

            fromView=(TextView)itemView.findViewById(R.id.from_);

            toView=(TextView)itemView.findViewById(R.id.to_);
            imView=(ImageView)itemView.findViewById(R.id.busimages);

            timeView=(TextView)itemView.findViewById(R.id.time_);

        }
        void bind(int listIndex){
           String x=numberOfItems[listIndex];
           String[] a=x.split("_");
           nmView.setText(a[1]);
           fromView.setText(a[2]);
           toView.setText(a[3]);
           timeView.setText(a[4]);
           int p= Integer.parseInt(a[1]);
           p=p%10;
           imView.setImageResource(imagesArray[p-1]);



        }
    }

}
