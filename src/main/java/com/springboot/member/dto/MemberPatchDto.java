package com.springboot.member.dto;

import com.springboot.member.entity.Member;
import com.springboot.stamp.Stamp;
import com.springboot.validator.NotSpace;
import lombok.Getter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Getter
public class MemberPatchDto {
    private long memberId;

    @NotSpace(message = "회원 이름은 공백이 아니어야 합니다")
    private String name;

    @NotSpace(message = "휴대폰 번호는 공백이 아니어야 합니다")
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$",
            message = "휴대폰 번호는 010으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다")
    private String phone;

    // 추가된 부분. 회원 상태 값을 사전에 체크하는 Custom Validator를 만들수도 있다.
    private Member.MemberStatus memberStatus;



    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
}
