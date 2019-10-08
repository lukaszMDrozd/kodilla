package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialServices.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike");
        User tom = new YGeneration("Tom");
        User eric = new ZGeneration("Eric");

        //When
        String mikeService = mike.sharePost();
        String tomService = tom.sharePost();
        String ericService = eric.sharePost();

        //Then
        Assert.assertEquals("This is a Twitter service", mikeService);
        System.out.println(mike.getUserName() + " = " + mikeService);
        Assert.assertEquals("This is a Facebook service", tomService);
        System.out.println(tom.getUserName() + " = " + tomService);
        Assert.assertEquals("This is a Snapchat service", ericService);
        System.out.println(eric.getUserName() + " = " + ericService);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike");

        //When
        System.out.println("Przed zmianą");
        String mikeService = mike.sharePost();
        System.out.println(mike.getUserName() + " = " + mikeService);

        System.out.println("Po zmianie:");
        mike.setSocialPublisher(new SnapchatPublisher());
        mikeService = mike.sharePost();
        System.out.println(mike.getUserName() + " = " + mikeService);

        //Then
        Assert.assertEquals("This is a Snapchat service", mikeService);

    }
}
