/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;

@JsonWriter
public record UpdatePermissionsResponseDto() {

  public UpdatePermissionsResponseDto(JsonObject ignore) {
    this();
  }

  public static UpdatePermissionsResponseDto fromJson(JsonObject ignore) {
    return new UpdatePermissionsResponseDto();
  }

  public JsonObject toJson() {
    return new JsonObject();
  }

  public static Builder builder() {
    return new AutoBuilder_UpdatePermissionsResponseDto_Builder();
  }

  @AutoBuilder
  public interface Builder {
    UpdatePermissionsResponseDto build();
  }
}
