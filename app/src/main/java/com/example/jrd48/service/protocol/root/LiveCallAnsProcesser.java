package com.example.jrd48.service.protocol.root;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.jrd48.GlobalStatus;
import com.example.jrd48.service.proto_gen.ProtoMessage;
import com.example.jrd48.service.protocol.CommonProcesser;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Administrator on 2017/8/24.
 */

public class LiveCallAnsProcesser extends CommonProcesser {
    public final static String ACTION = "ACTION.LiveCallAnsProcesser";

    public LiveCallAnsProcesser(Context context) {
        super(context);
    }

    @Override
    public void onGot(byte[] data) {
        try {
            ProtoMessage.CommonResp resp = ProtoMessage.CommonResp.parseFrom(ArrayUtils.subarray(data, 4, data.length));
            Intent i = new Intent(ACTION);
            try {
                if (resp == null) {
                    throw new Exception("unknown response.");
                }
                i.putExtra("error_code", resp.getErrorCode());
            } catch (Exception e) {
                e.printStackTrace();
                i.putExtra("error_code", ProtoMessage.ErrorCode.UNKNOWN_VALUE);
            }
            context.sendBroadcast(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onSent() {
        Log.i("chat", "pack sent: sms");
    }
}
