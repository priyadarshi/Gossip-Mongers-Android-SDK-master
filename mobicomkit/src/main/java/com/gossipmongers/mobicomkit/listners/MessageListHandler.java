package com.gossipmongers.mobicomkit.listners;

import com.gossipmongers.mobicomkit.api.conversation.Message;
import com.gossipmongers.mobicomkit.exception.ApplozicException;

import java.util.List;

/**
 * Created by reytum on 27/11/17.
 */

public interface MessageListHandler {
    void onResult(List<Message> messageList, ApplozicException e);
}
