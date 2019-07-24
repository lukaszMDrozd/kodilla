package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> theListOfUserForum = new ArrayList<>();

    public Forum(){
        theListOfUserForum.add(new ForumUser(100, "Filip", ForumUser.UserSex.M, LocalDate.of(1967,11,3), 0));
        theListOfUserForum.add(new ForumUser(101, "Alice", ForumUser.UserSex.F, LocalDate.of(1987,10,4), 101));
        theListOfUserForum.add(new ForumUser(102, "Peter", ForumUser.UserSex.M, LocalDate.of(1977,9,5), 111));
        theListOfUserForum.add(new ForumUser(103, "Peter", ForumUser.UserSex.M, LocalDate.of(1999,7,22), 111));
        theListOfUserForum.add(new ForumUser(104, "Paul", ForumUser.UserSex.M, LocalDate.of(1977,9,17), 11));
        theListOfUserForum.add(new ForumUser(105, "Laura", ForumUser.UserSex.F, LocalDate.of(2010,8,6), 999));
        theListOfUserForum.add(new ForumUser(105, "Laura", ForumUser.UserSex.F, LocalDate.of(1956,8,6), 999));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theListOfUserForum);
    }
}
