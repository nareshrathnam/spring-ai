package com.demo.springapp.client;

import org.springframework.ai.client.AiResponse;
import org.springframework.ai.prompt.Prompt;

public interface AiClient {
    default String generate(String message) {
		return null;
	}
    AiResponse generate(Prompt prompt);
}
