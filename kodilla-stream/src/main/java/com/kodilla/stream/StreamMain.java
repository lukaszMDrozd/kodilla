package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
        public static void main(String[] args) {
            Forum theListOfUserForum = new Forum();
            Map<Integer, ForumUser> theResultListOfUserForum = theListOfUserForum.getUserList().stream()
                    .filter(forumUser -> forumUser.getUserSex() == ForumUser.UserSex.M)
                    .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                    .filter(forumUser -> forumUser.getPublishedPostsNumber() >= 1)
                    .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

            System.out.println("Liczba odflitrowanych lementów w liście użytkowników forum: " + theResultListOfUserForum.size());

            theResultListOfUserForum.values().stream()
                    .forEach(s -> System.out.println(s));

        }
}


