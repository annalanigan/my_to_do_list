package com.example.codeclan.mytodolist.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codeclan.mytodolist.R;
import com.example.codeclan.mytodolist.Task.Task;

import java.util.ArrayList;

/**
 * Created by annalanigan on 10/01/2018.
 */

public class ListAdapter extends ArrayAdapter<Task> {

    private static class ViewHolder {
        TextView txtName;
        CheckBox checkBox;
    }

    public ListAdapter(Context context, ArrayList<Task> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
            listItemView.setLongClickable(true);
        }

        Task currentTask = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title_list);
        title.setText(currentTask.getName());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);
        icon.setImageResource(currentTask.getLogo());

        listItemView.setTag(currentTask);

        return listItemView;
    }


}

