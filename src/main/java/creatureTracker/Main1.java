package creatureTracker;

import creatureTracker.Classes.*;

import java.lang.reflect.Method;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Object> entities = List.of(
                new Canary(true, true),
                new Robin(true),
                new Daisy(true),
                new Rose(true),
                new Oak(true),
                new Pine(true),
                new Salmon(true),
                new Sunfish(true)
        );

        String[] names = {
                "Canary", "Robin", "Daisy", "Rose",
                "Oak", "Pine", "Salmon", "Sunfish"
        };
        Map<String, String> questions = new HashMap<>();
        questions.put("Can it sing?", "canSing");
        questions.put("Can it fly?", "canFly");
        questions.put("can it grow?", "canGrow");
        questions.put("is it alive?", "isAlive");
        questions.put("can it move?", "canMove");
        questions.put("Does it have skin?", "hasSkin");
        questions.put("does it have scales?", "hasScales");
        questions.put("does it have gills?", "hasGills");
        questions.put("can it swim?", "canSwim");
        questions.put("does it have feathers?", "hasFeathers");
        questions.put("does it have wings?", "hasWings");
        questions.put("does it have roots?", "hasRoots");
        questions.put("does it have leaves?", "hasLeaves");
        questions.put("does it have petals?", "hasPetals");
        questions.put("is it beautiful?", "isBeautiful");
        questions.put("does it have bark?", "hasBark");
        questions.put("does it have branches?", "hasBranches");
        questions.put("is it big?", "isBig");
        questions.put("is it red?", "isRed");
        questions.put("is it yellow?", "isYellow");
        questions.put("is it green?", "isGreen");

        while (true) {
            System.out.println("Choose an entity:");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("[%d] %s%n", i + 1, names[i]);
            }

            int choice = scanner.nextInt() - 1;
            if (choice < 0 || choice >= entities.size()) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            Object selected = entities.get(choice);
            System.out.println("You selected: " + names[choice]);

            List<String> qList = new ArrayList<>(questions.keySet());
            System.out.println("Ask a question:");
            for (int i = 0; i < qList.size(); i++) {
                System.out.printf("[%d] %s%n", i + 1, qList.get(i));
            }

            int qChoice = scanner.nextInt() - 1;
            if (qChoice < 0 || qChoice >= qList.size()) {
                System.out.println("No.");
                continue;
            }

            String methodName = questions.get(qList.get(qChoice));

            try {
                Method method = selected.getClass().getMethod(methodName);
                Object result = method.invoke(selected);
                boolean answer = Boolean.TRUE.equals(result);
                System.out.println("Answer: " + (answer ? "Yes!" : "No."));

                if (answer) {
                    List<String> path = new ArrayList<>();
                    Class<?> current = selected.getClass();

                    while (current != null && !current.getSimpleName().equals("Object")) {
                        path.add(current.getSimpleName());
                        try {
                            current.getDeclaredMethod(methodName);
                            break;
                        } catch (NoSuchMethodException ignored) {
                            current = current.getSuperclass();
                        }
                    }

                    System.out.println(String.join(" --> ", path));
                }

            } catch (NoSuchMethodException e) {
                System.out.println("No");
            } catch (Exception e) {
                System.out.println("Error checking trait: " + e.getMessage());
            }

            System.out.println();

        }
    }
}
