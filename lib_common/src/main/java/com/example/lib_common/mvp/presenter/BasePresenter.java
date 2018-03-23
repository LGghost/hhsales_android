package com.example.lib_common.mvp.presenter;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {
	//1.view层的引用
//	IGirlView girlView;
	//弱引用
	protected WeakReference<T> mViewRef;

	//进行绑定
	public void attachView(T view){
		mViewRef = new WeakReference<T>(view);
	}
	//进行解绑
	public void detachView(){
		mViewRef.clear();
	}
}
