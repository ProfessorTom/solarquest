package com.crappycomic.solarquest.net;

import java.io.IOException;

import com.crappycomic.solarquest.model.ServerModel;

/** The half of a connection on the same side as the {@link ServerModel}. */
public interface ServerSideConnection extends Runnable
{
   void sendServerObject(Object object) throws IOException;
}
