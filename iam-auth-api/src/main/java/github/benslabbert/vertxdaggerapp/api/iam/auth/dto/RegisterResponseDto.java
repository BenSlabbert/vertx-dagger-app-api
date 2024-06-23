/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import java.util.Set;

@JsonWriter
public record RegisterResponseDto() {

  public static RegisterResponseDto fromJson(JsonObject ignore) {
    return new RegisterResponseDto();
  }

  public static Set<String> missingRequiredFields(JsonObject json) {
    return Set.of();
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
