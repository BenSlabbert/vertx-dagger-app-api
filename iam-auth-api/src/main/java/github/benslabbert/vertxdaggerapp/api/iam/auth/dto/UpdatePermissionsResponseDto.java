/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;

@JsonWriter
public record UpdatePermissionsResponseDto() {

  public static UpdatePermissionsResponseDto fromJson(JsonObject ignore) {
    return new UpdatePermissionsResponseDto();
  }

  public JsonObject toJson() {
    return new JsonObject();
  }

  public static Builder builder() {
    return new AutoBuilder_UpdatePermissionsResponseDto_Builder();
  }

  public static JsonSchema schema() {
    return JsonSchema.of(new JsonObject());
  }

  @AutoBuilder
  public interface Builder {
    UpdatePermissionsResponseDto build();
  }
}
