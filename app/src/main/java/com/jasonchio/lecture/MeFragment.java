package com.jasonchio.lecture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
 * Created by zhaoyaobang on 2018/3/6.
 */

public class MeFragment extends Fragment{

	TitleLayout titleLayout;

	Button titleFirstButton;
	Button titleSecondButton;

	private View rootview;
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		//在fragment onCreateView 里缓存View，防止每次onCreateView 的时候重绘View
		if(rootview == null){
			rootview=inflater.inflate(R.layout.fragment_me,null);
			Toast.makeText(getActivity(),"FragmentMe==onCreateView",Toast.LENGTH_SHORT ).show();
		}
		ViewGroup parent=(ViewGroup)rootview.getParent();
		if(parent!=null){
			parent.removeView(rootview);
		}

		titleLayout= (TitleLayout)rootview.findViewById(R.id.me_title_layout);
		titleFirstButton=titleLayout.getFirstButton();
		titleSecondButton=titleLayout.getSecondButton();

		titleLayout.setTitle("我的资料");
		titleLayout.setFirstButtonBackground(R.drawable.ic_title_home);
		titleLayout.setSecondButtonBackground(R.drawable.ic_title_message);

		return rootview;
	}

}