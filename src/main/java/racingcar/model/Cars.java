package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import racingcar.exception.ExceptionCheck;
import racingcar.view.OutputView;

public class Cars {
    private final List<CarModel> carModelList = new ArrayList<>();

    public Cars(List<String> carList) {
        for (String s : carList) {
            ExceptionCheck.nameLengthValidation(s);
            this.carModelList.add(new CarModel(s));
        }
    }
    public void carsForward() {
        for ( CarModel carModel : carModelList) {
            carModel.increaseLocation(Randoms.pickNumberInRange(0, 9));
            OutputView.printRacing(carModel.getName(), carModel.getLocation());
        }
        System.out.println("");
    }

    public List<CarModel> winnerCheck(int maxLocation) {
        List<CarModel> winnerCars = new ArrayList<>();
        List<CarModel> Cars;

        for (int i = 0 ;i <= maxLocation; i++) {
            Cars = maxLocationCheck(i);
            if (!Cars.isEmpty()) {
                winnerCars = Cars;
            }
        }
        return winnerCars;
    }

    private List<CarModel> maxLocationCheck(int maxLocation) {
        List<CarModel> winnerCars = new ArrayList<>();

        for ( CarModel carModel : carModelList) {
            if (carModel.compareMaxLocation(maxLocation)) {
                winnerCars.add(carModel);
            }
        }
        return winnerCars;
    }
}
