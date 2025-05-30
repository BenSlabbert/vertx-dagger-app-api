/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.catalog.saga;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.common.dsl.ObjectSchemaBuilder;
import jakarta.validation.constraints.NotBlank;

@JsonWriter
public record CreatePurchaseOrderFailedResponse(@NotBlank String sagaId) {

  public static Builder builder() {
    return new AutoBuilder_CreatePurchaseOrderFailedResponse_Builder();
  }

  public static CreatePurchaseOrderFailedResponse fromJson(JsonObject json) {
    return CreatePurchaseOrderFailedResponse_JsonWriter.fromJson(json);
  }

  public static ObjectSchemaBuilder schemaBuilder() {
    return CreatePurchaseOrderFailedResponse_JsonWriter.schemaBuilder();
  }

  public JsonObject toJson() {
    return CreatePurchaseOrderFailedResponse_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder sagaId(String sagaId);

    CreatePurchaseOrderFailedResponse build();
  }
}
