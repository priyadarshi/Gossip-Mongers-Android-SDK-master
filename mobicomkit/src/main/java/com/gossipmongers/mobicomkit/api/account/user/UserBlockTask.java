package com.gossipmongers.mobicomkit.api.account.user;

import android.content.Context;

import com.gossipmongers.mobicomkit.feed.ApiResponse;
import com.gossipmongers.mobicommons.task.AlAsyncTask;


public class UserBlockTask extends AlAsyncTask<Void, Boolean> {

    private final TaskListener taskListener;
    private final Context context;
    private ApiResponse apiResponse;
    private String userId;
    private boolean block;
    private Exception mException;
    private Integer groupId;

    public UserBlockTask(Context context, TaskListener listener, String userId, boolean block) {
        this.context = context;
        this.taskListener = listener;
        this.userId = userId;
        this.block = block;
    }

    public UserBlockTask(Context context, TaskListener listener, String userId, boolean block, Integer groupId) {
        this.context = context;
        this.taskListener = listener;
        this.userId = userId;
        this.block = block;
        this.groupId = groupId;
    }

    @Override
    protected Boolean doInBackground() {
        try {
            apiResponse = UserService.getInstance(context).processUserBlock(userId, block, groupId);
            return apiResponse != null && apiResponse.isSuccess();
        } catch (Exception e) {
            e.printStackTrace();
            mException = e;
            return false;
        }
    }

    @Override
    protected void onPostExecute(final Boolean result) {
        if (result && this.taskListener != null) {
            this.taskListener.onSuccess(apiResponse);
        } else if (mException != null && this.taskListener != null) {
            this.taskListener.onFailure(apiResponse, mException);
        }
        this.taskListener.onCompletion();
    }

    public interface TaskListener {

        void onSuccess(ApiResponse apiResponse);

        void onFailure(ApiResponse apiResponse, Exception exception);

        void onCompletion();
    }


}
