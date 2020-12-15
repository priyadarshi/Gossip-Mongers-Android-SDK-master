package com.gossipmongers.mobicomkit.uiwidgets.uilistener;

import android.content.Context;

import com.gossipmongers.mobicommons.people.channel.Channel;

/**
 * Created by ashish on 04/06/18.
 */

public interface ALProfileClickListener {

    void onClick(Context context, String userId, Channel channel, boolean isToolbar);
}
