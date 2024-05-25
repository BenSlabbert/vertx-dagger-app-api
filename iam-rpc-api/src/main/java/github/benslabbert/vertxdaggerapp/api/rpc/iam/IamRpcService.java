/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.rpc.iam;

import github.benslabbert.vertxdaggerapp.api.rpc.iam.dto.CheckTokenRequestDto;
import github.benslabbert.vertxdaggerapp.api.rpc.iam.dto.CheckTokenResponseDto;
import github.benslabbert.vertxdaggercodegen.annotation.serviceproxy.GenerateProxies;
import io.vertx.core.Future;

@GenerateProxies
public interface IamRpcService {

  String ADDRESS = "RPC.IAM.TOKEN_CHECK";

  Future<CheckTokenResponseDto> check(CheckTokenRequestDto request);
}
