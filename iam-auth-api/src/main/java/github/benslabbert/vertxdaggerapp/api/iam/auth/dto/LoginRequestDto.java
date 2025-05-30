/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;

@JsonWriter
public record LoginRequestDto(@NotBlank String username, @NotBlank String password) {

  public static LoginRequestDto fromJson(JsonObject json) {
    return LoginRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return LoginRequestDto_JsonWriter.toJson(this);
  }

  public static JsonSchema schema() {
    return LoginRequestDto_JsonWriter.schema();
  }

  public static Builder builder() {
    return new AutoBuilder_LoginRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder password(String password);

    LoginRequestDto build();
  }
}
