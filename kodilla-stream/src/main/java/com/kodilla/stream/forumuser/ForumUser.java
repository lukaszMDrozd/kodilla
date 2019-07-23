package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final UserSex userSex;
    private final LocalDate dateOfBirth;
    private final int publishedPostsNumber;

    public ForumUser(final int userID, final String userName, final UserSex userSex, final LocalDate dateOfBirth, final int publishedPostsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.publishedPostsNumber = publishedPostsNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public UserSex getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPostsNumber() {
        return publishedPostsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser= {" +
                "userID=" + userID +
                ", userName=" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPostsNumber=" + publishedPostsNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return 31 * ((Integer) userID).hashCode();
    }

    public enum UserSex {M , F}
}
