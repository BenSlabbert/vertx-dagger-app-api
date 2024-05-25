/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.iam;

import dagger.Binds;
import dagger.Module;
import io.vertx.ext.auth.authentication.AuthenticationProvider;

@Module
interface ModuleBindings {

  @Binds
  AuthenticationProvider iamRpcServiceAuthenticationProvider(
      IamRpcServiceAuthenticationProvider provider);
}
