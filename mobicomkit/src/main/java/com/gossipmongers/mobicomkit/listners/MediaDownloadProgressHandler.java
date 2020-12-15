package com.gossipmongers.mobicomkit.listners;

import com.gossipmongers.mobicomkit.api.conversation.Message;
import com.gossipmongers.mobicomkit.exception.ApplozicException;

/**
 * Created by reytum on 27/11/17.
 */

public interface MediaDownloadProgressHandler {
    void onDownloadStarted();

    void onProgressUpdate(int percentage, ApplozicException e);

    void onCompleted(Message message, ApplozicException e);
}
