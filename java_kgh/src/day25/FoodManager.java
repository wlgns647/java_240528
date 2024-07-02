package day25;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class FoodManager {
    
    private List<Food> foodList;

    public FoodManager() {
        foodList = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void fileSave(String fileName) {
        try (
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            // 파일에 Food 객체를 기록
            for (Food food : foodList) {
                oos.writeObject(food);
            }
            System.out.println("파일에 데이터를 저장했습니다.");
        } catch (IOException e) {
            System.err.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FoodManager manager = new FoodManager();
        
        // Food 객체 샘플 추가
        manager.addFood(new Food("사과", 20));
        
        // 파일 저장
        manager.fileSave("food.dat");
    }
}
