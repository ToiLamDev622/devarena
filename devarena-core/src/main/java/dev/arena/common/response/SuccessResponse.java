package dev.arena.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record SuccessResponse<T>(
        boolean success,
        int status,
        T data,
        String message,
        Map<String, Object> metadata,
        LocalDateTime timestamp
) {
}
