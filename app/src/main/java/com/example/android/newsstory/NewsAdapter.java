package com.example.android.newsstory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        titleView.setText(title);

        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        String sectionName = currentNews.getSectionName();
        sectionNameView.setText(sectionName);

        TextView authorNameView = (TextView) listItemView.findViewById(R.id.author_name);
        String authorName = currentNews.getAuthorName();
        authorNameView.setText(authorName);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date_published);
        String datePublished = currentNews.getDatePublished();
        dateView.setText(datePublished);

        return listItemView;
    }
}