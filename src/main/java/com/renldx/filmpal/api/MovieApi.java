package com.renldx.filmpal.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.renldx.filmpal.entity.Genres;
import io.github.sashirestela.openai.SimpleOpenAI;
import io.github.sashirestela.openai.common.ResponseFormat;
import io.github.sashirestela.openai.domain.chat.ChatMessage;
import io.github.sashirestela.openai.domain.chat.ChatRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieApi {

    private final ObjectMapper objectMapper;
    private final SimpleOpenAI openAI;

    public MovieApi(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;

        this.openAI = SimpleOpenAI.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .build();
    }

    public MovieApiResponse GetMovies(Genres genre) throws JsonProcessingException {
        var chatRequest = ChatRequest.builder()
                .model("gpt-4o-mini")
                .message(ChatMessage.SystemMessage.of("You are a movie enthusiast."))
                .message(ChatMessage.UserMessage.of(String.format("List the latest top 5 %s movies.", genre)))
                .responseFormat(ResponseFormat.jsonSchema(ResponseFormat.JsonSchema.builder()
                        .name("MovieResponseFormat")
                        .schemaClass(MovieApiResponseSchema.class)
                        .build()))
                .build();

        var futureChat = openAI.chatCompletions().create(chatRequest);
        var chatResponse = futureChat.join();
        var jsonResponse = chatResponse.firstContent();

        return objectMapper.readValue(jsonResponse, MovieApiResponse.class);
    }

    public static class MovieApiResponseSchema {
        public List<MovieResponse> movies;

        public static class MovieResponse {
            public String title;
            public String release;
        }
    }
}
