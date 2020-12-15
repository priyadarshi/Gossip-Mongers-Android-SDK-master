package com.gossipmongers.mobicomkit.listners;

import com.gossipmongers.mobicomkit.feed.MqttMessageResponse;

public interface AlMqttListener {
    void onMqttMessageReceived(MqttMessageResponse mqttMessage);
}
