/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.catalog.saga;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

@JsonWriter
public record CreatePurchaseOrderRequest(@NotBlank String sagaId) {

  public static final String CREATE_PURCHASE_ORDER_TOPIC = "Saga.Catalog.CreatePurchaseOrder";

  public static Builder builder() {
    return new AutoBuilder_CreatePurchaseOrderRequest_Builder();
  }

  public static CreatePurchaseOrderRequest fromJson(JsonObject json) {
    return CreatePurchaseOrderRequest_JsonWriter.fromJson(json);
  }

  public static Set<String> missingRequiredFields(JsonObject json) {
    return CreatePurchaseOrderRequest_JsonWriter.missingRequiredFields(json);
  }

  public JsonObject toJson() {
    return CreatePurchaseOrderRequest_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder sagaId(String sagaId);

    CreatePurchaseOrderRequest build();
  }
}
