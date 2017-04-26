package com.wyh.iquestion.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wyh.iquestion.TopicFragment;
import com.wyh.iquestion.controller.TopicController;

import java.util.ArrayList;
import java.util.Map;

public class TopicPagerAdapter extends FragmentPagerAdapter {
	private ArrayList<Map<String, Object>> dataList;

	public TopicPagerAdapter(FragmentManager fm,
			TopicController topicController,
			TopicFragmentCallBacks topicFragmentCallBacks) {
		super(fm);
		TopicFragment.setController(topicController);
		dataList = topicController.getTopicList();
		TopicFragment.setCallBack(topicFragmentCallBacks);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dataList.size();
	}

	@Override
	public Fragment getItem(int position) {
		return new TopicFragment(position);
	}
}
