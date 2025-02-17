package com.fitfit.server.api.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record MemberSignUpRequest(
        @Email(message = "올바른 이메일 형식을 입력하세요.")
        @NotBlank(message = "이메일을 입력하세요.")
        String email,

        @NotBlank(message = "비밀번호를 입력하세요.")
        @Size(min = 4, message = "비밀번호는 최소 4자리 이상이어야 합니다.")
        String password,

        @NotBlank(message = "이름을 입력하세요.")
        String name
) {}