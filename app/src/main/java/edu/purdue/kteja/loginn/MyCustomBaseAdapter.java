//package edu.purdue.kteja.loginn;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
///**
// * Created by karanteja on 26/05/17.
// */public class MyCustomBaseAdapter extends BaseAdapter {
//    private static ArrayList<String> searchArrayList;
//
//    private LayoutInflater mInflater;
//
//    public MyCustomBaseAdapter(Context context, ArrayList<String> results) {
//        searchArrayList = results;
//        mInflater = LayoutInflater.from(context);
//    }
//
//    public int getCount() {
//        return searchArrayList.size();
//    }
//
//    public Object getItem(int position) {
//        return searchArrayList.get(position);
//    }
//
//    public long getItemId(int position) {
//        return position;
//    }
//
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//        if (convertView == null) {
//            convertView = mInflater.inflate(R.layout.mylist, null);
//            holder = new ViewHolder();
//            holder.txtName = (TextView) convertView.findViewById(R.id.Owner);
//            holder.txtCityState = (TextView) convertView.findViewById(R.id.Summary);
//
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//
//        return convertView;
//    }
//
//    static class ViewHolder {
//        TextView txtName;
//        TextView txtCityState;
//        TextView txtPhone;
//    }