/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.catalog.saga;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import io.vertx.json.schema.common.dsl.ObjectSchemaBuilder;
import jakarta.validation.constraints.NotBlank;

@JsonWriter
public record CreatePurchaseOrderSuccessResponse(@NotBlank String sagaId) {

  public static Builder builder() {
    return new AutoBuilder_CreatePurchaseOrderSuccessResponse_Builder();
  }

  public static CreatePurchaseOrderSuccessResponse fromJson(JsonObject json) {
    return CreatePurchaseOrderSuccessResponse_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return CreatePurchaseOrderSuccessResponse_JsonWriter.toJson(this);
  }

  public static JsonSchema schema() {
    return CreatePurchaseOrderSuccessResponse_JsonWriter.schema();
  }

  public static ObjectSchemaBuilder schemaBuilder() {
    return CreatePurchaseOrderSuccessResponse_JsonWriter.schemaBuilder();
  }

  @AutoBuilder
  public interface Builder {

    Builder sagaId(String sagaId);

    CreatePurchaseOrderSuccessResponse build();
  }
}
