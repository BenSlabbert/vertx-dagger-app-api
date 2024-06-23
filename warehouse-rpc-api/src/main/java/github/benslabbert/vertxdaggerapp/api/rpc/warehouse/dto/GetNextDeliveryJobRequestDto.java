/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.warehouse.dto;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

@JsonWriter
public record GetNextDeliveryJobRequestDto(@NotBlank String truckId) {

  public static Builder builder() {
    return new AutoBuilder_GetNextDeliveryJobRequestDto_Builder();
  }

  public static GetNextDeliveryJobRequestDto fromJson(JsonObject json) {
    return GetNextDeliveryJobRequestDto_JsonWriter.fromJson(json);
  }

  public static Set<String> missingRequiredFields(JsonObject json) {
    return GetNextDeliveryJobRequestDto_JsonWriter.missingRequiredFields(json);
  }

  public JsonObject toJson() {
    return GetNextDeliveryJobRequestDto_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder truckId(String truckId);

    GetNextDeliveryJobRequestDto build();
  }
}
