package algo_questions_extra;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalsWentInTwoByTwo {
    public static void main(String[] args) {

        List<String> animalList = List.of("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan");

        System.out.println(getTwoByTwo(animalList));

    }
    public static Map<String, Integer> getTwoByTwo(List<String> animals) {

        Map<String, Integer> result = new HashMap<>();

        int counter;
        for (String animal : animals) {
            int count = result.getOrDefault(animal, 0);

            if (count < 2) {
                result.put(animal, ++count);
            }
        }

        result.entrySet().removeIf(animal -> animal.getValue() < 2);

        return result;
    }

    //This solution is a good example about using stream.
    public static Map<String, Integer> getPairs(List<String> animals) {
        return animals.stream()
                .collect(Collectors.groupingBy(animal -> animal, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> 2));
    }
}
/*
The Animals Went in Two by Two
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We
are only interested in getting one pair of each animal, and not interested in any animals where there are
less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter, which you need to check to see which animals
there are at least two of, and then return a Map<String, Integer> that contains the name of the animal
along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: []
Output: {}
Input: ['goat']
Output: {}
Input : ["dog", "goat", "dog"]
Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
Output: {horse=2, rabbit=2, goat=2
 */
