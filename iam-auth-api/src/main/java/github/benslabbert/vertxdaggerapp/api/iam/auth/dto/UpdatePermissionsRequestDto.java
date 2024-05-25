/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import static io.vertx.json.schema.common.dsl.Keywords.minLength;
import static io.vertx.json.schema.common.dsl.Schemas.objectSchema;
import static io.vertx.json.schema.common.dsl.Schemas.stringSchema;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;

@JsonWriter
public record UpdatePermissionsRequestDto(String username, Access access) {

  public static String USERNAME_FIELD = "username";
  public static String ACCESS_FIELD = "access";

  public static final JsonSchema SCHEMA =
      JsonSchema.of(
          objectSchema()
              .requiredProperty(USERNAME_FIELD, stringSchema().with(minLength(1)))
              .requiredProperty(ACCESS_FIELD, Access.SCHEMA)
              .toJson());

  public static UpdatePermissionsRequestDto fromJson(JsonObject json) {
    return UpdatePermissionsRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return UpdatePermissionsRequestDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_UpdatePermissionsRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder access(Access access);

    UpdatePermissionsRequestDto build();
  }
}
