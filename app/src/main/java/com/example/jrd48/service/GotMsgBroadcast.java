package com.example.jrd48.service;

import android.content.Context;

import com.example.jrd48.chat.crash.MyApplication;

/**
 * Created by Administrator on 2016/10/19 0019.
 */

public class GotMsgBroadcast extends MyBroadcastObject {
    public GotMsgBroadcast(Context context) {
        super(context);
        setPackageName(MyApplication.getContext().getPackageName());
        setActionName("com.luobin.mychat.action.on_got_msg");

    }
}
