package com.gossipmongers.mobicomkit.uiwidgets.uilistener;

import com.gossipmongers.mobicommons.people.channel.Channel;
import com.gossipmongers.mobicommons.people.contact.Contact;

public interface CustomToolbarListener {

    void setToolbarTitle(String title);

    void setToolbarSubtitle(String subtitle);

    void setToolbarImage(Contact contact, Channel channel);

    void hideSubtitleAndProfilePic();

}
