package com.gossipmongers.mobicomkit.uiwidgets.async;

import android.content.Context;
import android.text.TextUtils;

import com.gossipmongers.mobicomkit.api.MobiComKitConstants;
import com.gossipmongers.mobicomkit.channel.service.ChannelService;
import com.gossipmongers.mobicomkit.uiwidgets.R;
import com.gossipmongers.mobicommons.task.AlAsyncTask;

/**
 * Created by sunil on 17/5/16.
 */
public class ApplozicChannelAddMemberTask extends AlAsyncTask<Void, Boolean> {

    Context context;
    Integer channelKey;
    String userId;
    ChannelAddMemberListener channelAddMemberListener;
    ChannelService channelService;
    Exception exception;
    String addResponse ;

    public ApplozicChannelAddMemberTask(Context context, Integer channelKey, String userId, ChannelAddMemberListener channelAddMemberListener) {
        this.channelKey = channelKey;
        this.userId = userId;
        this.channelAddMemberListener = channelAddMemberListener;
        this.context = context;
        this.channelService = ChannelService.getInstance(context);
    }

    @Override
    protected Boolean doInBackground() {
        try {
            if (!TextUtils.isEmpty(userId) && userId.trim().length() != 0 && channelKey != null) {
                addResponse = channelService.addMemberToChannelProcess(channelKey, userId.trim());
                if (!TextUtils.isEmpty(addResponse)) {
                    return MobiComKitConstants.SUCCESS.equals(addResponse);
                }
            } else {
                throw new Exception(context.getString(R.string.applozic_userId_error_info_in_logs));
            }
        } catch (Exception e) {
            e.printStackTrace();
            exception = e;
            return false;
        }
        return false;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        super.onPostExecute(result);

        if (result && channelAddMemberListener != null) {
            channelAddMemberListener.onSuccess(addResponse, context);
        } else if (!result && channelAddMemberListener != null) {
            channelAddMemberListener.onFailure(addResponse, exception, context);
        }
    }

    public interface ChannelAddMemberListener {
        void onSuccess(String response, Context context);

        void onFailure(String response, Exception e, Context context);
    }
}
