//package com.emojiHW.repository;
//
//import com.emojiHW.config.AppConfig;
//import com.emojiHW.domain.Conversation;
//import com.emojiHW.domain.Emoji;
//import com.emojiHW.domain.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import javax.transaction.Transactional;
//import java.util.Optional;
//
//import static junit.framework.TestCase.assertNotNull;
//import static org.junit.Assert.assertEquals;
//
//@WebAppConfiguration
//@ContextConfiguration(classes = {AppConfig.class})
//@RunWith(SpringJUnit4ClassRunner.class)
//@ActiveProfiles("unit")
//
//public class ConversationRepositoryTest {
//    @Autowired
//    private ConversationRepository conversationRepository;
//
//    @Test
//    @Transactional
//    public void findByIdTest() {
//        Conversation c = new Conversation();
//        c.setContent("smilling_face");
//        conversationRepository.save(c);
//        Optional<Conversation> testConversation = conversationRepository.findById(c.getId());
//        assertNotNull(testConversation);
//        assertEquals(c.getId(), testConversation.get().getId());
//
//    }
//}
