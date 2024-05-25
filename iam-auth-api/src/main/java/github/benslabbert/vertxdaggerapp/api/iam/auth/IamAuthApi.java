/* Licensed under Apache-2.0 2024. */
package github.benslabbert.vertxdaggerapp.api.iam.auth;

import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.LoginRequestDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.LoginResponseDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.RefreshRequestDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.RefreshResponseDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.RegisterRequestDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.RegisterResponseDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.UpdatePermissionsRequestDto;
import github.benslabbert.vertxdaggerapp.api.iam.auth.dto.UpdatePermissionsResponseDto;
import io.vertx.core.Future;

public interface IamAuthApi {

  Future<LoginResponseDto> login(LoginRequestDto req);

  Future<RefreshResponseDto> refresh(RefreshRequestDto req);

  Future<RegisterResponseDto> register(RegisterRequestDto req);

  Future<UpdatePermissionsResponseDto> updatePermissions(UpdatePermissionsRequestDto req);
}
