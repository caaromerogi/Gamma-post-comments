package com.posada.santiago.gamapostsandcomments.application.handler;

import com.google.gson.Gson;
import com.posada.santiago.gamapostsandcomments.application.bus.models.PostModel;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class QueuePostHandler implements Consumer<String> {

    private final Gson gson = new Gson();

    @Override
    public void accept(String receive) {
        PostModel post = gson.fromJson(receive, PostModel.class);
        System.out.println(post);
    }
}
