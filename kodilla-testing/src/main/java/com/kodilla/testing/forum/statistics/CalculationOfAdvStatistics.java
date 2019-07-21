package com.kodilla.testing.forum.statistics;

public class CalculationOfAdvStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averagePostsNumberPerUser;
    private int averageCommentsNumberPerUser;
    private int averageCommentsNumberPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        setNumberOfUsers(statistics.usersNames().size());
        setNumberOfPosts(statistics.postsCount());
        setNumberOfComments(statistics.commentsCount());
        setAverageCommentsNumberPerPost(numberOfComments / numberOfPosts);
        setAverageCommentsNumberPerUser(numberOfComments / numberOfUsers);
        setAveragePostsNumberPerUser(numberOfPosts / numberOfUsers);
    }

    public String showStatistics(){
        return "Statystyki forum: " +
                " liczba użytkowników: " + getNumberOfUsers() +
                " liczba postów: " + getNumberOfPosts() +
                " liczba komentarzy: " + getNumberOfComments() +
                "***\n" +
                " średnie wartości: \n" +
                " średnia liczba postów na użytkownika: " + getAveragePostsNumberPerUser() +
                " średnia liczba komentarzy na użytkownika: " + getAverageCommentsNumberPerUser() +
                " średnia liczba komentarzy na post: " + getAverageCommentsNumberPerPost();

    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public void setAveragePostsNumberPerUser(int averagePostsNumberPerUser) {
        this.averagePostsNumberPerUser = averagePostsNumberPerUser;
    }

    public void setAverageCommentsNumberPerUser(int averageCommentsNumberPerUser) {
        this.averageCommentsNumberPerUser = averageCommentsNumberPerUser;
    }

    public void setAverageCommentsNumberPerPost(int averageCommentsNumberPerPost) {
        this.averageCommentsNumberPerPost = averageCommentsNumberPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public int getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public int getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }
}
