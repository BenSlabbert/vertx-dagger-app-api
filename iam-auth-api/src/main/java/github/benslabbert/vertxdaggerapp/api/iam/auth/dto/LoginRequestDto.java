/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import static io.vertx.json.schema.common.dsl.Keywords.minLength;
import static io.vertx.json.schema.common.dsl.Schemas.objectSchema;
import static io.vertx.json.schema.common.dsl.Schemas.stringSchema;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.jsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;
import java.util.Objects;
import java.util.Set;

@JsonWriter
public record LoginRequestDto(@NotBlank String username, @NotBlank String password) {

  public static String USERNAME_FIELD = "username";
  public static String PASSWORD_FIELD = "password";

  public static final JsonSchema SCHEMA =
      JsonSchema.of(
          objectSchema()
              .requiredProperty(USERNAME_FIELD, stringSchema().with(minLength(1)))
              .requiredProperty(PASSWORD_FIELD, stringSchema().with(minLength(1)))
              .toJson());

  public LoginRequestDto {
    Objects.requireNonNull(username);
    Objects.requireNonNull(password);
  }

  public static LoginRequestDto fromJson(JsonObject json) {
    return LoginRequestDto_JsonWriter.fromJson(json);
  }

  public static Set<String> missingRequiredFields(JsonObject json) {
    return LoginRequestDto_JsonWriter.missingRequiredFields(json);
  }

  public JsonObject toJson() {
    return LoginRequestDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_LoginRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder password(String password);

    LoginRequestDto build();
  }
}
