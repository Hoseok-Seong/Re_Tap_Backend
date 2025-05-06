package hoselabs.re_tap.domain.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FcmTokenReq {
    @NotBlank(message = "Fcm 토큰은 필수입니다.")
    private String fcmToken;
}
