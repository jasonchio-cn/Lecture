package com.jasonchio.lecture.util;

/**
 * /**
 * <p>
 * ----------Dragon be here!----------/
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━by:zhaoyaobang
 * <p>
 * Created by zhaoyaobang on 2018/3/31.
 */
public class ConstantClass {

	//当前登录用户的ID
	public static int userOnline=0;

	//服务器地址
	public static final String ADDRESS="119.29.93.31";
	//注册端口
	public static final int SIGNIN_PORT=2001;
	//找回密码端口
	public static final int FINDPWD_PORT=2002;
	//登录端口
	public static final int LOGIN_PORT=2003;
	//请求讲座信息端口
	public static final int LECTURE_REQUEST_PORT=2004;
	//请求评论信息端口
	public static final int COMMENT_REQUEST_PORT=2005;
	//请求个人信息端口
	public static final int MYINFO_REQUEST_PORT=2006;
	//请求个人信息端口
	public static final int CHANGE_MYINFO_REQUEST_PORT =2007;
	//查找讲座端口
	public static final int SEARCH_LECTURE_REQUEST_PORT=2008;
	//请求"我的想看"端口
	public static final int MYWANTED_LECTURE_REQUEST_PORT=2009;
	//请求"我的关注"端口
	public static final int MYFOCUSE_LIBRARY_REQUEST_PORT=2010;
	//请求"我的点评"端口
	public static final int MYCOMMENT_REQUEST_PORT=2011;
	//添加或取消讲座至/从"我的想看"端口
	public static final int ADD_CANCEL_WANTED_REQUEST_PORT=2012;
	//添加或取消讲座至/从"我的关注"端口
	public static final int ADD_CANCEL_FOCUSE_REQUEST_PORT=2013;
	//请求图书馆信息端口
	public static final int LIBRARY_REQUEST_PORT=2014;
	//发送用户位置端口
	public static final int SEND_POSITION_PORT=2015;
	//添加评论端口
	public static final int ADD_COMMENT_PORT=2016;
	//给评论点赞或取消点赞端口
	public static final int LIKE_COMMENT_PORT=2017;
	//用户更改头像端口
	public static final int CHANGE_HEAD_PORT=2018;
}