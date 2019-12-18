package com.rnxmpp.service;

import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.roster.Roster;

/**
 * Created by Kristian Frølund on 7/19/16.
 * Copyright (c) 2016. Teletronics. All rights reserved
 */

public interface XmppServiceListener {
    void onError(Exception e);
    void onLoginError(String errorMessage);
    void onLoginError(Exception e);
    void onMessage(Message message);
    void onMessageIdGenerated(String messageId);
    void onMessageSent(String messageId);
    void onMessageCreated(Message message);
    void onMessageDelivered(String messageId);
    void onRosterReceived(Roster roster);
    void onIQ(IQ iq);
    void onPresence(Presence presence);
    void onConnnect(String username, String password);
    void onDisconnect(Exception e);
    void onLogin(String username, String password);



}
