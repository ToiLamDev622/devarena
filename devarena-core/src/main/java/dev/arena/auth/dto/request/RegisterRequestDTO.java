package dev.arena.auth.dto.request;

public record RegisterRequestDTO(
        String username,
        String email,
        String password,
        String fullName
) {
}
