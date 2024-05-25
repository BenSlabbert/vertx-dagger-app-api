/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.warehouse;

import dagger.Module;

@Module
public interface WarehouseRpcApiModule {

  WarehouseRpcServiceProviderFactory warehouseRpcServiceProviderFactory();
}
