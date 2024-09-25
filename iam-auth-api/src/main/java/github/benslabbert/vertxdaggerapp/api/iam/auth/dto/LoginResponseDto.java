/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import jakarta.validation.constraints.NotBlank;
import java.util.Objects;

@JsonWriter
public record LoginResponseDto(@NotBlank String token, @NotBlank String refreshToken) {

  public LoginResponseDto {
    Objects.requireNonNull(token);
    Objects.requireNonNull(refreshToken);
  }

  public static LoginResponseDto fromJson(JsonObject json) {
    return LoginResponseDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return LoginResponseDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_LoginResponseDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder token(String token);

    Builder refreshToken(String refreshToken);

    LoginResponseDto build();
  }
}
