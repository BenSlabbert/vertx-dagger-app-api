/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;

@JsonWriter
public record RefreshRequestDto(@NotBlank String username, @NotBlank String token) {

  public static RefreshRequestDto fromJson(JsonObject json) {
    return RefreshRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return RefreshRequestDto_JsonWriter.toJson(this);
  }

  public static JsonSchema schema() {
    return RefreshRequestDto_JsonWriter.schema();
  }

  public static Builder builder() {
    return new AutoBuilder_RefreshRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder token(String token);

    RefreshRequestDto build();
  }
}
