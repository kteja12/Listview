package edu.purdue.kteja.loginn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<String> searchArrayList;
    private static ArrayList<String> searchArrayList1;
    private static ArrayList<String> searchArrayList2;
    private LayoutInflater mInflater;
    private Context c1;

    public MyCustomBaseAdapter(Context context, ArrayList<String> results,ArrayList<String> result1,ArrayList<String> images) {
        searchArrayList = results;
       searchArrayList1 = result1;
        searchArrayList2 = images;
        c1 = context;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custome_row_view, null);
            holder = new ViewHolder();
            holder.txtTitle = (TextView) convertView.findViewById(R.id.ntitle);
            holder.txtSummary = (TextView) convertView.findViewById(R.id.summary);
           holder.image = (ImageView) convertView.findViewById(R.id.imageView2);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtTitle.setText(searchArrayList.get(position));
       holder.txtSummary.setText(searchArrayList1.get(position));
        Picasso.with(c1)
                .load(searchArrayList2.get(position))
                .noFade()
                .into(holder.image);
//        holder.txtPhone.setText(searchArrayList.get(position).getPhone());

        return convertView;
    }

    static class ViewHolder {
        TextView txtTitle;
        TextView txtSummary;
        ImageView image;
    }

}