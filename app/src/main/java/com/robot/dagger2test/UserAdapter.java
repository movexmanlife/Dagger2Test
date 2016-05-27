package com.robot.dagger2test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/5/25.
 */
public class UserAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<String> users;

    /**
     * 创建 UserAdapter 类，并在构造函数前添加 @Inject 注解。这样，Dagger 就会在需要获取 UserAdapter 对象时，调用这个被标记的构造函数，从而生成一个 UserAdapter 对象。
     * @param context
     * @param users
     */
    @Inject
    public UserAdapter(Context context, List<String> users) {
        this.inflater = LayoutInflater.from(context);
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.text = (TextView)convertView.findViewById(R.id.text);
            convertView.setTag(convertView);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.text.setText(users.get(position));

        return convertView;
    }

    static class ViewHolder {
        TextView text;
    }
}
