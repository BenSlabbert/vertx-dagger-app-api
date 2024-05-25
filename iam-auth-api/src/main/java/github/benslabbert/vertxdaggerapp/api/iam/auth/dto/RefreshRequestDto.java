/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import static io.vertx.json.schema.common.dsl.Keywords.minLength;
import static io.vertx.json.schema.common.dsl.Schemas.objectSchema;
import static io.vertx.json.schema.common.dsl.Schemas.stringSchema;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import java.util.Objects;

@JsonWriter
public record RefreshRequestDto(String username, String token) {

  public static String USERNAME_FIELD = "username";
  public static String TOKEN_FIELD = "token";

  public static final JsonSchema SCHEMA =
      JsonSchema.of(
          objectSchema()
              .requiredProperty(USERNAME_FIELD, stringSchema().with(minLength(1)))
              .requiredProperty(TOKEN_FIELD, stringSchema().with(minLength(1)))
              .toJson());

  public RefreshRequestDto {
    Objects.requireNonNull(username);
    Objects.requireNonNull(token);
  }

  public static RefreshRequestDto fromJson(JsonObject json) {
    return RefreshRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return RefreshRequestDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_RefreshRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder token(String token);

    RefreshRequestDto build();
  }
}
