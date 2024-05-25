/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.iam;

import dagger.Module;
import io.vertx.ext.auth.authentication.AuthenticationProvider;

@Module(includes = {IamRpcServiceProvider.class, ModuleBindings.class})
public interface IamRpcApiModule {

  IamRpcService iamRpcService();

  AuthenticationProvider iamRpcServiceAuthenticationProvider();
}
