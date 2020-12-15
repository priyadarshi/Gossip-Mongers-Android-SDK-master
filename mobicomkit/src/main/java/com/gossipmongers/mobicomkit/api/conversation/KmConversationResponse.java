package com.gossipmongers.mobicomkit.api.conversation;

import com.gossipmongers.mobicomkit.api.account.user.UserDetail;
import com.gossipmongers.mobicomkit.feed.ChannelFeed;
import com.gossipmongers.mobicommons.json.JsonMarker;

public class KmConversationResponse extends JsonMarker {
    private Message[] message;
    private ChannelFeed[] groupFeeds;
    private UserDetail[] userDetails;

    public Message[] getMessage() {
        return message;
    }

    public ChannelFeed[] getGroupFeeds() {
        return groupFeeds;
    }

    public UserDetail[] getUserDetails() {
        return userDetails;
    }
}
