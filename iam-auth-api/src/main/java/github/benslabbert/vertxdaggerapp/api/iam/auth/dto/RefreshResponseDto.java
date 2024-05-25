/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import java.util.Objects;

@JsonWriter
public record RefreshResponseDto(String token, String refreshToken) {

  public static String TOKEN_FIELD = "token";
  public static String REFRESH_TOKEN_FIELD = "refreshToken";

  public RefreshResponseDto {
    Objects.requireNonNull(token);
    Objects.requireNonNull(refreshToken);
  }

  public static RefreshResponseDto fromJson(JsonObject json) {
    return RefreshResponseDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return RefreshResponseDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_RefreshResponseDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder token(String token);

    Builder refreshToken(String refreshToken);

    RefreshResponseDto build();
  }
}
