import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// import com.opencsv.CSVReader; что-то пошло не так =(


public class ArrayLee{

    // создаём списки
    private static String[] myStringList = {"1", "46", "33", "3", "6",
                                     "67", "5", "sleeps", "98", "7",
                                     "13", "never", "85", "4.3", "8"};
    private static String[] myStringList2 = {"1", "Moscow", "12", "3", "6.2"};
    private static String csvFile = "C:\\Users\\l_kuk\\Documents\\GitHub\\JavaLessons\\data.csv";
    
    
        public static void main(String[] args) {


                                                    // ArrayList
            // создаём пустой Array List с дженериком   
            ArrayList<String> myArrayList1 = new ArrayList<>();

            // создаём Array List с 12-ю ячейками без дженерика
            ArrayList myArrayList2 = new ArrayList(12);

            // копируем myArrayList2 в myArrayList3
            ArrayList<String> myArrayList3 = new ArrayList<>(myArrayList2);
            
            // создаём myArrayListInt с данными типа Integer с 5-ю ячейками
            ArrayList<Integer> myArrayListInt = new ArrayList<Integer>(5);
            
            // создаём myArrayListStr с данными типа String (короткий вариант)
            ArrayList<String> myArrayListStr = new ArrayList<>();
        
            // из списка можно создать массив
            List<String[]> myArrayListStr2 = new ArrayList<String[]>();

            // Из массива нельзя создать список
            // ArrayList<String> myArrayListStr2 = new List<>();

            // добавляем в myArrayListStr2 myStringList, затем myStringList2  
            myArrayListStr2.add(myStringList);
            myArrayListStr2.add(myStringList2);
            
            // для каждого элемента strArr в myArrayListStr2
            for (String[] strArr : myArrayListStr2){

                // перевести этот элемент к строке (Arrays.toString(strArr)) и вывести на экран
                System.out.println(Arrays.toString(strArr));
            }
                                                 // HashMap

            // создаём HashMap с именем myHashMap, используя в треугольных скобках
            // типы данных для ключей и для значений
            HashMap<Integer, String> myHashMap = new HashMap<>();

            // добавляем элемент "клиент 1" с ключом 0 
            myHashMap.put(0, "клиент 1");
            
            
            // выводим на экран
            System.out.println(myHashMap + " - это HashMap");
            
            Integer i = 0;
                                                        // читаем csv в hashMap
            try 
            {
                BufferedReader myReader = new BufferedReader(new FileReader(csvFile));
                String nextLine;
                while ((nextLine = myReader.readLine()) != null) 
                {
                        if (nextLine != null)
                        {
                            myHashMap.put(i++, nextLine); // добавляем элемент в myHashMap 
                            myArrayList1.add(nextLine);  // // добавляем этот же элемент в myArrayList1
                        }
                }
                myReader.close();  // закрываем reader
            
            } 
            catch(Exception e)
            {
                System.out.println(e);
            }

            String listCar1 = myHashMap.get(12);
            
            System.out.println(myHashMap.size() + " - размер карты.");
            System.out.println(listCar1 + " - содержимое 12 ключа.");
            myHashMap.remove(12);  // удаляем содержимое по 12 ключу
            System.out.println( "удаляем содержимое по 12 ключу.");
            System.out.println(myHashMap.get(12) + " - новое содержимое 12 ключа.");
            System.out.println(myArrayList1.get(28) + " - содержимое 28 индекса.");
            myArrayList1.remove(28);  //  удаляем содержимое по 28 индексу
            System.out.println(" - удалено содержимое по 28 ключу.");
            System.out.println(myArrayList1.get(28) + " - новое содержимое 28 индекса.");
            System.out.println(myArrayList1.size() + " - размер массива.");
            System.out.println(Arrays.toString(myArrayList1.get(0).split(",")) + " - содержимое 0 индекса.");

        }
}