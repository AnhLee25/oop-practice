package OOP.exercise4.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StudentColumn {
    ID(1, "id"),
    FULLNAME(2, "fullName"),
    DOB(3, "doB"),
    SEX(4, "sex"),
    PHONE_NUMBER(5, "phoneNumber"),
    UNIVERSITY_NAME(6, "universityName"),
    GRADE_LEVEL(7, "gradeLevel"),
    GPA(8, "gpa"),
    BEST_REWARD_NAME(9, "bestRewardName"),
    ENGLISH_SCORE(10, "englishScore"),
    ENTRY_TEST_SCORE(11, "entryTestScore"),
    TYPE(12, "type");
    private final Integer index;
    private final String name;
}
