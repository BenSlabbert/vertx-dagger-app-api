/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonWriter
public record RegisterRequestDto(
    @NotBlank String username, @NotBlank String password, @NotNull Access access) {

  public static RegisterRequestDto fromJson(JsonObject json) {
    return RegisterRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return RegisterRequestDto_JsonWriter.toJson(this);
  }

  public static JsonSchema schema() {
    return RegisterRequestDto_JsonWriter.schema();
  }

  public static Builder builder() {
    return new AutoBuilder_RegisterRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder password(String password);

    Builder access(Access access);

    RegisterRequestDto build();
  }
}
