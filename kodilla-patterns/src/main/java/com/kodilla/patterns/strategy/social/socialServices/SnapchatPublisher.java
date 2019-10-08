package com.kodilla.patterns.strategy.social.socialServices;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    public String share() {
        return "This is a Snapchat service";
    }
}
