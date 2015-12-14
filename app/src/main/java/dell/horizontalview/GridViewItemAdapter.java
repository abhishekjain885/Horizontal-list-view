package dell.horizontalview;

/**
 * Created by dell on 10/21/2015.
 */



import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class GridViewItemAdapter extends RecyclerView.Adapter<GridViewItemAdapter.GridViewHolder>
{
    Context context;
    ArrayList<GridViewItemData> arrayList;

    public GridViewItemAdapter(Context context,ArrayList<GridViewItemData> arrayList)
    {
        this.arrayList=arrayList;
        this.context=context;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_view_item_layout,viewGroup,false);
        GridViewHolder gridViewHolder=new GridViewHolder(v);
        return gridViewHolder;
    }

    @Override
    public void onBindViewHolder(GridViewHolder gridViewHolder, int i)
    {
        gridViewHolder.itemDescription.setText(arrayList.get(i).itemDescription);
        gridViewHolder.itemPrice.setText(arrayList.get(i).itemPrice);
        gridViewHolder.itemId.setText(arrayList.get(i).id);
        Picasso.with(context).load(arrayList.get(i).imageURL).fit().placeholder(R.drawable.progress_animation).into(gridViewHolder.itemImage);
    }

    @Override
    public int getItemCount()
    {
        return arrayList.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView itemDescription;
        TextView itemPrice;
        TextView itemId;
        ImageView itemImage;

        public GridViewHolder(View itemView)
        {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cv);
            itemDescription=(TextView)itemView.findViewById(R.id.item_description);
            itemPrice=(TextView)itemView.findViewById(R.id.item_price);
            itemImage=(ImageView)itemView.findViewById(R.id.item_image);
            itemId=(TextView)itemView.findViewById(R.id.itemId);
            cardView.setUseCompatPadding(true);
            //cardView.setElevation(7);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
