package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Application {
    public List<String> splitCarNames(String carNames) {
        return Arrays.stream(carNames.split(",")).toList();
    }

    public void validateCarNameLength(List<String> carName) {
        if(carName.stream().anyMatch(name -> name.length() >= 5)) {
            throw new IllegalArgumentException("입력한 자동차 이름중에 5자가 넘는 이름이 있습니다.");
        }
    }

    public static void checkEnglishInput(String inputStr) {
        if (!inputStr.matches("^[a-zA-Z]*$")) {
            throw new IllegalArgumentException("입력한 값은 영어가 아닙니다. 영어 문자만 허용됩니다.");
        }
    }

    public void outputCarStepDistance(String carName, int stepDistance) {
        System.out.print(carName + " : ");
        for (int i = 0; i < stepDistance; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {

    }
}
