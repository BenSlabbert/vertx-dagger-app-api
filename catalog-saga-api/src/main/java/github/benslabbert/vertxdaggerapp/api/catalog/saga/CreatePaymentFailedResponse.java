/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.catalog.saga;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.common.dsl.ObjectSchemaBuilder;
import jakarta.validation.constraints.NotBlank;

@JsonWriter
public record CreatePaymentFailedResponse(@NotBlank String sagaId) {

  public static Builder builder() {
    return new AutoBuilder_CreatePaymentFailedResponse_Builder();
  }

  public static CreatePaymentFailedResponse fromJson(JsonObject json) {
    return CreatePaymentFailedResponse_JsonWriter.fromJson(json);
  }

  public static ObjectSchemaBuilder schemaBuilder() {
    return CreatePaymentFailedResponse_JsonWriter.schemaBuilder();
  }

  public JsonObject toJson() {
    return CreatePaymentFailedResponse_JsonWriter.toJson(this);
  }

  @AutoBuilder
  public interface Builder {

    Builder sagaId(String sagaId);

    CreatePaymentFailedResponse build();
  }
}
