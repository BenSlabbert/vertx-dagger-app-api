/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth.dto;

import static io.vertx.json.schema.common.dsl.Keywords.minLength;
import static io.vertx.json.schema.common.dsl.Schemas.arraySchema;
import static io.vertx.json.schema.common.dsl.Schemas.objectSchema;
import static io.vertx.json.schema.common.dsl.Schemas.stringSchema;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.auto.value.extension.toprettystring.ToPrettyString;
import com.google.common.collect.ImmutableSet;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.json.schema.common.dsl.ObjectSchemaBuilder;
import java.util.Set;

@AutoValue
public abstract class Access {

  private static final String GROUP_FIELD = "group";
  private static final String ROLE_FIELD = "role";
  private static final String PERMISSIONS_FIELD = "permissions";

  public static final ObjectSchemaBuilder SCHEMA =
      objectSchema()
          .requiredProperty(GROUP_FIELD, stringSchema().with(minLength(1)))
          .requiredProperty(ROLE_FIELD, stringSchema().with(minLength(1)))
          .requiredProperty(
              PERMISSIONS_FIELD, arraySchema().items(stringSchema().with(minLength(1))));

  public abstract String group();

  public abstract String role();

  public abstract Set<String> permissions();

  @Override
  @Memoized
  public abstract int hashCode();

  @ToPrettyString
  public abstract String toPrettyString();

  @Override
  @Memoized
  public abstract String toString();

  public JsonObject toJson() {
    JsonObject json = new JsonObject();

    json.put(GROUP_FIELD, group());
    json.put(ROLE_FIELD, role());

    JsonArray array = new JsonArray();
    permissions().forEach(array::add);
    json.put(PERMISSIONS_FIELD, array);

    return json;
  }

  public static Builder builder() {
    return new $$AutoValue_Access.Builder();
  }

  public static Access fromJson(JsonObject jsonObject) {
    Builder builder = builder();

    String group = jsonObject.getString(GROUP_FIELD);
    builder.group(group);

    String role = jsonObject.getString(ROLE_FIELD);
    builder.role(role);

    jsonObject.getJsonArray(PERMISSIONS_FIELD).stream()
        .map(Object::toString)
        .forEach(builder::addPermission);

    return builder.build();
  }

  public static ImmutableSet<String> missingRequiredFields(JsonObject json) {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();
    if (null == json.getString(GROUP_FIELD)) {
      builder.add(GROUP_FIELD);
    }
    if (null == json.getString(ROLE_FIELD)) {
      builder.add(ROLE_FIELD);
    }
    if (null == json.getJsonArray(PERMISSIONS_FIELD)) {
      builder.add(PERMISSIONS_FIELD);
    } else {
      JsonArray array = json.getJsonArray(PERMISSIONS_FIELD);
      if (array.isEmpty()) {
        builder.add(PERMISSIONS_FIELD);
      } else {
        for (Object o : array) {
          if (!(o instanceof String)) {
            builder.add(PERMISSIONS_FIELD);
            break;
          }
        }
      }
    }
    return builder.build();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder group(String group);

    public abstract Builder role(String role);

    abstract ImmutableSet.Builder<String> permissionsBuilder();

    public final Builder addPermission(String permission) {
      permissionsBuilder().add(permission);
      return this;
    }

    public final Builder addPermissions(String... permissions) {
      permissionsBuilder().add(permissions);
      return this;
    }

    abstract Access autoBuild();

    public final Access build() {
      Access access = autoBuild();
      if (access.permissions().isEmpty()) {
        throw new IllegalStateException("must provide at least one permission");
      }
      return access;
    }
  }
}
