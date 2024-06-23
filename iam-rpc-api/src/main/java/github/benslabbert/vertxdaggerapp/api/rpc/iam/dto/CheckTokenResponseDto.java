/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.iam.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

@JsonWriter
public record CheckTokenResponseDto(
    @NotNull Boolean valid, @NotBlank String userPrincipal, @NotBlank String userAttributes) {

  public static Builder builder() {
    return new AutoBuilder_CheckTokenResponseDto_Builder();
  }

  public static CheckTokenResponseDto fromJson(JsonObject json) {
    return CheckTokenResponseDto_JsonWriter.fromJson(json);
  }

  public static Set<String> missingRequiredFields(JsonObject json) {
    return CheckTokenResponseDto_JsonWriter.missingRequiredFields(json);
  }

  public JsonObject toJson() {
    return CheckTokenResponseDto_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder valid(boolean valid);

    Builder userPrincipal(String userPrincipal);

    Builder userAttributes(String userAttributes);

    CheckTokenResponseDto build();
  }
}
