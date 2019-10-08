package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialServices.TwitterPublisher;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
