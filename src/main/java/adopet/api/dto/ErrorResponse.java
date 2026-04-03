package adopet.api.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponse(
        String message,
        Integer status,
        HttpStatus httpStatus,
        String path,
        LocalDateTime dateTime
) {
}
