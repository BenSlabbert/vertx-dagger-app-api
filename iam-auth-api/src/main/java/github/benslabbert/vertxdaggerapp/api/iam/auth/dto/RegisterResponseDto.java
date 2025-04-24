/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;

@JsonWriter
public record RegisterResponseDto() {

  public static RegisterResponseDto fromJson(JsonObject ignore) {
    return new RegisterResponseDto();
  }

  public JsonObject toJson() {
    return new JsonObject();
  }

  public static Builder builder() {
    return new AutoBuilder_RegisterResponseDto_Builder();
  }

  @AutoBuilder
  public interface Builder {
    RegisterResponseDto build();
  }
}
