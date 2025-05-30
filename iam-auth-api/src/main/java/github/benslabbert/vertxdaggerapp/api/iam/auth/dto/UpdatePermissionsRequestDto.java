/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonWriter
public record UpdatePermissionsRequestDto(@NotBlank String username, @NotNull Access access) {

  public static UpdatePermissionsRequestDto fromJson(JsonObject json) {
    return UpdatePermissionsRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return UpdatePermissionsRequestDto_JsonWriter.toJson(this);
  }

  public static JsonSchema schema() {
    return UpdatePermissionsRequestDto_JsonWriter.schema();
  }

  public static Builder builder() {
    return new AutoBuilder_UpdatePermissionsRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder access(Access access);

    UpdatePermissionsRequestDto build();
  }
}
