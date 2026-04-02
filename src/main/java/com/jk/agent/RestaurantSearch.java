package com.jk.agent;

import com.google.adk.agents.LlmAgent;
import com.google.adk.tools.GoogleMapsTool;
import com.google.adk.web.AdkWebServer;
public class RestaurantSearch {

    public static void main(String[] args ) {
    
            LlmAgent restaurantGuide = LlmAgent.builder()
                    .name("restaurant-guide")
                    .description("A restaurant guide for the traveler")
                    .instruction("""
                            You are a restaurant guide for gourmet travelers.
                            Use the `google_maps` tool when asked to search for restaurants
                            near a certain location.
                            """)
                    .model("gemini-2.5-flash")
                    .tools(new GoogleMapsTool())
                    .build();
                    AdkWebServer.start(restaurantGuide);
    
    }       
}