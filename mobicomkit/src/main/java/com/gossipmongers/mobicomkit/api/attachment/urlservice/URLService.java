package com.gossipmongers.mobicomkit.api.attachment.urlservice;

import com.gossipmongers.mobicomkit.api.conversation.Message;

import java.io.IOException;
import java.net.HttpURLConnection;

public interface URLService {

    HttpURLConnection getAttachmentConnection(Message message) throws IOException;

    String getThumbnailURL(Message message) throws IOException;

    String getFileUploadUrl();

    String getImageUrl(Message message);
}
