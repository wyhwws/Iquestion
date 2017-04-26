package com.wyh.iquestion.controller;

import android.content.Context;

import com.wyh.iquestion.util.DBUtil;

public class WelcomeController {
	public void init(Context context) {
		new DBUtil(context).openDatabase();// 导入数据库
		
		//暂时去掉
//		// 可以认为没有获取到外网IP就是没有连上网,并且只检查一次暂不考虑太多
//		NetWorkUtil.getNetIpFromWeb(context);
//		//设置截图的路径
//		new FileUtil((Activity)context).setPic_path();
	}
}
