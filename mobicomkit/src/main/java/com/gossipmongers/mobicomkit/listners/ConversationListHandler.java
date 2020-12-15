package com.gossipmongers.mobicomkit.listners;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.conversation.AlConversation;
import com.gossipmongers.mobicomkit.exception.ApplozicException;

import java.util.List;

public interface ConversationListHandler {
    void onResult(Context context, List<AlConversation> conversationList, ApplozicException e);
}
