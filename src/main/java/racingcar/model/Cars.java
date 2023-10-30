package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import racingcar.view.OutputView;

public class Cars {

    public static final int MAX_NUMBER = 9;
    public static final int MIN_NUMBER = 0;
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void moveCars() {
        for (Car car : carList) {
            car.forward(Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER));
            OutputView.printRacing(car.getName(), car.getLocation());
        }
        System.out.println("");
    }

    public List<Car> winner() {
        int maxLocation = maxLocation();

        return carList.stream()
            .filter(car -> car.isMaxLocation(maxLocation))
            .toList();
    }

    private int maxLocation() {
        return carList.stream()
            .mapToInt(Car::getLocation)
            .max()
            .getAsInt();
    }
}
