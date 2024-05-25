/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.warehouse;

import dagger.assisted.AssistedFactory;
import io.vertx.core.eventbus.DeliveryOptions;

@AssistedFactory
public interface WarehouseRpcServiceProviderFactory {

  WarehouseRpcServiceProvider create(DeliveryOptions deliveryOptions);
}
