package com.posada.santiago.gamapostsandcomments.application.bus;



import com.posada.santiago.gamapostsandcomments.application.handler.QueueCommentHandler;
import com.posada.santiago.gamapostsandcomments.application.handler.QueuePostHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class RabbitMqConsumer {
    private static final String PROXY_QUEUE_POST_CREATED = "events.proxy.post.created";
    private static final String PROXY_QUEUE_COMMENT_ADDED = "events.proxy.comment.added";

    @Autowired
    private QueueCommentHandler commentHandler;

    @Autowired
    private QueuePostHandler postHandler;


    @RabbitListener(queues = PROXY_QUEUE_POST_CREATED)
    public void listenToPostQueue(String received){
        /**Starting point*/
        postHandler.accept(received);
    }

    @RabbitListener(queues = PROXY_QUEUE_COMMENT_ADDED)
    public void listenToCommentQueue(String received){
        /**Starting point*/
        commentHandler.accept(received);
    }

}
