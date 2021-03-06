package com.emojiHW.repository;

import com.emojiHW.domain.Conversation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConversationRepository extends CrudRepository<Conversation,Long> {
//    List<Conversation>findAll();

//    @Query("Select c FROM Conversation c")
//    List<Conversation> findConversation();
////    Conversation findByUserIdIgnoreCase(Long userId);


    @Query("SELECT c from Conversation c join fetch c.user where c.user.id=?1")
    List<Conversation> findConversationByUserId(Long userId);

//    @Query("select c from Conversation c join fetch c.emoji where c.id=?1")
//    Conversation findConversationWithEmoji(Long Id);

    void deleteById(Long id);
}
