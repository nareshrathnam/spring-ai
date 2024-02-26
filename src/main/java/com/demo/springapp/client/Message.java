package com.demo.springapp.client;

import java.util.Map;

import org.springframework.ai.prompt.messages.MessageType;

public interface Message {
    String getContent();
    Map<String, Object> getProperties();
    MessageType getMessageType();
}