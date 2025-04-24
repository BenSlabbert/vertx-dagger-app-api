/* Licensed under Apache-2.0 2023. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import static io.vertx.json.schema.common.dsl.Keywords.minLength;
import static io.vertx.json.schema.common.dsl.Schemas.objectSchema;
import static io.vertx.json.schema.common.dsl.Schemas.stringSchema;

import com.google.auto.value.AutoBuilder;
import github.benslabbert.vertxjsonwriter.annotation.JsonWriter;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.JsonSchema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

@JsonWriter
public record RegisterRequestDto(
    @NotBlank String username, @NotBlank String password, @NotNull Access access) {

  public static String USERNAME_FIELD = "username";
  public static String PASSWORD_FIELD = "password";
  public static String ACCESS_FIELD = "access";

  public static final JsonSchema SCHEMA =
      JsonSchema.of(
          objectSchema()
              .requiredProperty(USERNAME_FIELD, stringSchema().with(minLength(1)))
              .requiredProperty(PASSWORD_FIELD, stringSchema().with(minLength(1)))
              .requiredProperty(ACCESS_FIELD, objectSchema())
              .toJson());

  public RegisterRequestDto {
    Objects.requireNonNull(username);
    Objects.requireNonNull(password);
    Objects.requireNonNull(access);
  }

  public static RegisterRequestDto fromJson(JsonObject json) {
    return RegisterRequestDto_JsonWriter.fromJson(json);
  }

  public JsonObject toJson() {
    return RegisterRequestDto_JsonWriter.toJson(this);
  }

  public static Builder builder() {
    return new AutoBuilder_RegisterRequestDto_Builder();
  }

  @AutoBuilder
  public interface Builder {

    Builder username(String username);

    Builder password(String password);

    Builder access(Access access);

    RegisterRequestDto build();
  }
}
