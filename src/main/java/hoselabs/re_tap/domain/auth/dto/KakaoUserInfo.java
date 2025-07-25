package hoselabs.re_tap.domain.auth.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class KakaoUserInfo implements OauthUserInfo {

    private final String username;
    private final String profileImageUrl;
}
