/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.iam.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;

@JsonWriter
public record CheckTokenRequestDto(String token) {

  public static Builder builder() {
    return new AutoBuilder_CheckTokenRequestDto_Builder();
  }

  public static CheckTokenRequestDto fromJson(JsonObject json) {
    return CheckTokenRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return CheckTokenRequestDto_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder token(String token);

    CheckTokenRequestDto build();
  }
}
