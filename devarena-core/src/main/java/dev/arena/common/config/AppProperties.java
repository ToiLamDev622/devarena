package dev.arena.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("app")
public record AppProperties(
        Api api,
        Security security,
        JudgeService judgeService,
        Submission submission,
        Contest contest,
        Storage storage
) {
    public record Api(
            String version,
            String prefix
    ) {
    }

    public record Security(
            Jwt jwt,
            Cors cors,
            RateLimiting rateLimiting
    ) {
        public record Jwt(
                String secretKey,
                Long accessTokenExpiry,
                Long refreshTokenExpiry
        ) {
        }

        public record Cors(
                List<String> allowedOrigins,
                List<String> allowedMethods,
                List<String> allowedHeaders,
                Boolean allowCredentials
        ) {
        }

        public record RateLimiting(
                Boolean enabled,
                Long submissionPerMinute,
                Long apiPerMinute
        ) {
        }
    }

    public record JudgeService(
            String url
    ) {
    }

    public record Submission(
            Long maxCodeLength,
            Long maxExecutionTime,
            Long maxMemoryMb
    ) {
    }

    public record Contest(
            Long freezeTimeMinutes,
            Long maxTeamSize
    ) {
    }

    public record Storage(
            String path
    ) {
    }
}
