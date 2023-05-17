package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        // 요리사 객체 생성
        Cooking cooking = new Cooking();
        // 내가 원하는 요리를 만들고
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        // 요리사에게 음식을 만들어 달라고 요청
        Cook cook = cooking.makeCook(menuItem);

        // 객체끼리 비교할 때, equals and hashCode가 있어야함.
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
