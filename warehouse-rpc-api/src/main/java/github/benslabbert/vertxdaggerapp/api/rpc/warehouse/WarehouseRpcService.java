/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.warehouse;

import github.benslabbert.vertxdaggerapp.api.rpc.warehouse.dto.GetNextDeliveryJobRequestDto;
import github.benslabbert.vertxdaggerapp.api.rpc.warehouse.dto.GetNextDeliveryJobResponseDto;
import github.benslabbert.vertxdaggercodegen.annotation.security.SecuredProxy;
import github.benslabbert.vertxdaggercodegen.annotation.serviceproxy.GenerateProxies;
import io.vertx.core.Future;

@SecuredProxy
@GenerateProxies
public interface WarehouseRpcService {

  String ADDRESS = "RPC.WAREHOUSE.JOBS";

  @SecuredProxy.SecuredAction(
      group = "warehouse",
      role = "worker",
      permissions = {"read"})
  Future<GetNextDeliveryJobResponseDto> getNextDeliveryJob(GetNextDeliveryJobRequestDto request);
}
