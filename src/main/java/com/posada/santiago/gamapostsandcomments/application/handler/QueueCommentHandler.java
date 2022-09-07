package com.posada.santiago.gamapostsandcomments.application.handler;


import com.google.gson.Gson;
import com.posada.santiago.gamapostsandcomments.application.bus.models.CommentModel;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class QueueCommentHandler implements Consumer<String> {

    private final Gson gson = new Gson();

    @Override
    public void accept(String receive) {
        CommentModel comment = gson.fromJson(receive, CommentModel.class);
        System.out.println(comment);
    }
}