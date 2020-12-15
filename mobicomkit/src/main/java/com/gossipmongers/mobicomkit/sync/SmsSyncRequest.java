package com.gossipmongers.mobicomkit.sync;

import com.gossipmongers.mobicommons.json.JsonMarker;
import com.gossipmongers.mobicomkit.api.conversation.Message;

import java.util.List;

public class SmsSyncRequest extends JsonMarker {

    private List<Message> smsList;

    public List<Message> getSmsList() {
        return smsList;
    }

    public void setSmsList(List<Message> smsList) {
        this.smsList = smsList;
    }


}


