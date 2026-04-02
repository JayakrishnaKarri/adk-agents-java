package com.jk.agent;

import com.google.adk.agents.LlmAgent;
import com.google.adk.web.AdkWebServer;

public class EnglishTutor {
    public static void main(String[] args) {
        AdkWebServer.start(
            LlmAgent.builder()
                .name("english-tutor")
                .description("A friendly english tutor")
                .instruction("""
                    You are a english tutor for teenagers.
                    You teaches vocabulary and grammar.
                    Provides pronunciation tips.
                    """)
                .model("gemini-2.5-flash")
                .build()
        );
    }
}