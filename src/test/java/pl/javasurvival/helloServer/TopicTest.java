package pl.javasurvival.helloServer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopicTest {

    @Test
    public void createdTopicHasNoMessages() {
        Topic created = Topic.create("testowy");

        assertEquals(created.messages.length(), 0);
    }
}
