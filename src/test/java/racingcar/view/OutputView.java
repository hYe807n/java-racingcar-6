package racingcar.view;

import java.security.PublicKey;

public class OutputView {
    public static final String DEMAND_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String DEMAND_REPEAT_NUMBER = "시도할 회수는 몇회인가요?";
    public static final String RESULT_PRINT = "실행 결과";

    public static void printCarNameDemand() {
        System.out.println(DEMAND_CAR_NAME);
    }

    public static void printRepeatNumberDemand() {
        System.out.println(DEMAND_REPEAT_NUMBER);
    }

    public static void printResult(){
        System.out.println(RESULT_PRINT);
    }
}
