package hoselabs.re_tap.domain.goal.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GoalStatus {
    DRAFT("DRAFT", "임시저장"),
    SCHEDULED("SCHEDULED", "예약발송"),
    DELIVERED("DELIVERED", "도착완료");

    private final String key;
    private final String name;
}
